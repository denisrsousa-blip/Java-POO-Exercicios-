package banco;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(1, 100);
        Conta conta2 = new ContaPoupanca(2, 200);

        conta1.depositar(50);
        conta2.depositar(50);

        conta1.sacar(30);
        conta2.sacar(30);

        conta1.calcularRendimento();
        conta2.calcularRendimento();

        System.out.println("Saldo Conta Corrente: " + conta1.getSaldo());
        System.out.println("Saldo Conta Poupanca: " + conta2.getSaldo());
    }
}