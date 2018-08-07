public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Felipe");
        funcionario.setCpf("34334334398");
        funcionario.setSalario(3000);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());
        System.out.println(funcionario.getSalario());

        // protect permite alterar o salrio dessa maneira
        //private não
        //funcionario.salario = 5000;
        System.out.println(funcionario.getSalario());

    }
}
