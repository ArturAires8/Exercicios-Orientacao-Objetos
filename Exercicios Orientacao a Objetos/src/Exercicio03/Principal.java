package Exercicio03;

public class Principal {
    public static void main(String[] args) {

        // Criando um retangulo com largura 5 e altura 3

        Retangulo retangulo = new Retangulo(5, 3);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }


}
