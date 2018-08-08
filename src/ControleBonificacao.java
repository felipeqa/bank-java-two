public class ControleBonificacao {

    private double soma;

//    public void registra(Gerente gerente){
//        double boni = gerente.getBonificacao();
//        this.soma = this.soma + boni;
//    }

    public void registra(Funcionario funcionario){
        double boni = funcionario.getBonificacao();
        this.soma = this.soma + boni;
    }

//    public void registra(EditorVideo editorVideo){
//        double boni = editorVideo.getBonificacao();
//        this.soma = this.soma + boni;
//    }

    public double getSoma() {
        return soma;
    }
}
