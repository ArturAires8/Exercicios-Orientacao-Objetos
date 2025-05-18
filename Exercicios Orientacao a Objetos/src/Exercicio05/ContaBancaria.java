package Exercicio05;

public class ContaBancaria {

    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso. %n", valor);
        } else {
            System.out.println("valor de depósito inválido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.printf("Saque de R$ %.2f realizado com sucesso. %n", valor);
            } else {
                System.out.println("Saldo isuficiente para relalizar o saque.");
            }
        } else {
            System.out.println("Valor de saque inválido");
        }
    }

    public void exibirInformacoes() {

        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);

    }
}

