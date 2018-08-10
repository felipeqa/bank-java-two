public class SistemaInterno {

    private int senha = 2222;

    public void autentica(FuncionarioAutenticavel funcionarioAutenticavel){
        boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
        if(autenticou){
            System.out.println("Voce tem acesso ao Sistema Interno!!!");
        } else {
            System.out.println("Voce não tem acesso ao Sistema interno");
        }
    }
}
