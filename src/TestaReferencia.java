public class TestaReferencia {

    public static void main(String[] args) {
        //nem todo funcionário é um gerente
        //Gerente g1 = new Funcionario();
        // todo gerente é um funcionário
        //Funcionario g1 = new Gerente();

        Gerente g1 = new Gerente();
        g1.setNome("Felipe");
        String nome = g1.getNome();
        System.out.println(nome);
        g1.setSalario(5000);

        Funcionario f1 = new Funcionario();
        f1.setSalario(2000);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500);

        Designer d1 = new Designer();
        d1.setSalario(2500);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g1);
        controle.registra(f1);
        controle.registra(ev);
        controle.registra(d1);

        System.out.println(controle.getSoma());


        //g1 é referencia de um Funcionário e não um Gerente então não tem o métodos referente a classe gerente
        //g1.autentica(123);
    }
}
