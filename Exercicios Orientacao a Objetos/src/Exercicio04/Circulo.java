package Exercicio04;

public class Circulo {

    double raio;

    private static final double PI = 3.141592653589793;

    Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea() {
        return PI * raio * raio;
    }

    double calcularCircunferencia() {
        return 2 * PI * raio;
    }
}
