package Exercicio02;

public class Principal {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Soma: " + calculadora.somar(10, 5));
        System.out.println("Subtracao: " + calculadora.subtrair(50,25));
        System.out.println("Multiplica: " + calculadora.multiplicar(85,200));
        System.out.println("Divisão " + calculadora.dividir(100,3));


    }


}
