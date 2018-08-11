
// extends a classe Funcionario e herda todos os seus atributos e metódos e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    // subreescrever um método é só colocar a mesma assinatura da super classe
    public double getBonificacao(){
        System.out.println("Chamando o método de bonificação do GERENTE");
    //usando um super + método
        double salario = super.getSalario();
        return salario;
    }

    @Override
    public boolean autentica(int senha) {
      if(this.senha == senha){
        return true;
      }else{
        return false;
      }
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
