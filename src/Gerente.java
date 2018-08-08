
// extends a classe Funcionario e herda todos os seus atributos e metódos
public class Gerente extends Funcionario {

    private int senha;

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }

    }

    public void setSenha(int senha) {
        this.senha = senha;
    }



    // subreescrever um método é só colocar a mesma assinatura da super classe
        public double getBonificacao(){
            System.out.println("Chamando o método de bonificação do GERENTE");
        //usando um super + método
        return super.getBonificacao() + super.getSalario();
    }
}
