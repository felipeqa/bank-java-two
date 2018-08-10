
// extends a classe FuncionarioAutenticavel e herda todos os seus atributos e metódos
public class Gerente extends FuncionarioAutenticavel {

    // subreescrever um método é só colocar a mesma assinatura da super classe
        public double getBonificacao(){
            System.out.println("Chamando o método de bonificação do GERENTE");
        //usando um super + método
            double salario = super.getSalario();
            return salario;
    }
}
