import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Criar uma nova conta bancária com o saldo inicial(feito)
        double saldoInicial = scanner.nextDouble();
        ContaBancaria2 conta = new ContaBancaria2(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria2 {
    private double saldo;

    public ContaBancaria2(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        // TODO: Incrementar o saldo com o valor e imprimir "Deposito feito."
        saldo += valor;
        System.out.println("Deposito feito.");

        imprimirSaldo();
    }

    public void sacar(double valor) {
        // TODO: Verificar se o saldo é suficiente considerando o valor:
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque feito.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        // Se sim, atualizar o saldo e imprimir "Saque feito."
        // Se não, imprimir "Saldo insuficiente. Saque não realizado."
        imprimirSaldo();
    }

    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}