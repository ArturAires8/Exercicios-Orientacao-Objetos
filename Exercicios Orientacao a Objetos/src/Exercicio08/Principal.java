package Exercicio08;

public class Principal {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.marca = "Renault";
        carro1.modelo = "Sandero";
        carro1.ano = 2014;

        System.out.printf("Idade: %d anos", carro1.calcularIdade());



    }


}
