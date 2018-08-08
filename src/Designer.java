
// extends a classe Funcionario e herda todos os seus atributos e metódos
public class Designer extends Funcionario {

    // subreescrever um método é só colocar a mesma assinatura da super classe
        public double getBonificacao(){
            System.out.println("Chamando o método de bonificação do Editor de video");
        //usando um super + método
        return 200;
    }
}
