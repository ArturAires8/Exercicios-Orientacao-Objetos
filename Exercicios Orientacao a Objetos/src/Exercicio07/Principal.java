package Exercicio07;

public class Principal {

    public static void main(String[] args) {

        double[] notasDoAluno = {8.7, 7.0, 5.5, 6.8};
        Aluno aluno1 = new Aluno("Artur", "2050", notasDoAluno);

        double media = aluno1.calculaMedia();
        System.out.println("Média do aluno " + aluno1.getNome() + ": " + media);

    }


}
