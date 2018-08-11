public class TesteSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(2221);

        Cliente cliente = new Cliente();
        cliente.setSenha(2312);

        SistemaInterno interno = new SistemaInterno();

        interno.autentica(gerente);
        interno.autentica(adm);
        interno.autentica(cliente);


    }
}
