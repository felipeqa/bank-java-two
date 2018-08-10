public class FuncionarioAutenticavel extends Funcionario {

    private int senha = 2222;

    @Override
    public double getBonificacao() {
        return 0;
    }

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
}
