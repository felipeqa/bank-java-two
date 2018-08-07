public class ColaboradorTeste {

    public static void main(String[] args) {
        Colaborador colaboradorUm = new Colaborador();
        Colaborador colaboradorDois = new Colaborador();
        Colaborador colaboradorTres = new Colaborador();

        colaboradorUm.setNome("Teste 1");
        colaboradorDois.setNome("Teste 2");
        colaboradorTres.setNome("Teste 3");
        colaboradorUm.setSalario(5000);
        colaboradorDois.setSalario(5000);
        colaboradorTres.setSalario(5000);
        colaboradorDois.setTipo(1);
        colaboradorTres.setTipo(2);
        System.out.println(colaboradorUm.getBonificacao());
        System.out.println(colaboradorDois.getBonificacao());
        System.out.println(colaboradorTres.getBonificacao());
    }
}
