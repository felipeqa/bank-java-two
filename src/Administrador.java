
// extends a classe FuncionarioAutenticavel e herda todos os seus atributos e metódos
public class Administrador extends FuncionarioAutenticavel {

    // subreescrever um método é só colocar a mesma assinatura da super classe
        public double getBonificacao(){
            System.out.println("Chamando o método de bonificação do ADMINISTRAÇÂO");
        //usando um super + método;
            return 1000;
    }
}
