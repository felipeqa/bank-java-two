
// extends a classe Funcionario e herda todos os seus atributos e metódos e assina o contrato Autenticavel
public class Administrador extends Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticador;

    public Administrador(){
        this.autenticador = new AutenticacaoUtil();
    }

    // subreescrever um método é só colocar a mesma assinatura da super classe
        public double getBonificacao(){
            System.out.println("Chamando o método de bonificação do ADMINISTRAÇÂO");
        //usando um super + método;
            return 1000;
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}

