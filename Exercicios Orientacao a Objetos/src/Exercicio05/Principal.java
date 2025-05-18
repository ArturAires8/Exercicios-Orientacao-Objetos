package Exercicio05;

public class Principal {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(2020, "Artur Aires Silva", 1500.00);

        conta1.depositar(500);
        conta1.sacar(300);
        conta1.sacar(5000.00);

        conta1.exibirInformacoes();

        System.out.println("-------------------------------------");

        ContaBancaria conta2 = new ContaBancaria(1050, "Cibelle", 2000.00);
        conta2.depositar(800.00);
        conta2.sacar(850);
        conta2.sacar(9500.00);

        conta2.exibirInformacoes();

    }


}
