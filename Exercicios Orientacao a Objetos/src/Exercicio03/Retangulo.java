package Exercicio03;

//  Exercicio 3 Classe Retangulo: Calcule área e perímetro com base em largura e altura.


public class Retangulo {

    double largura;
    double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    double calcularArea() {
        return largura * altura;
    }

    double calcularPerimetro() {
        return 2 * (largura + altura);
    }

}



