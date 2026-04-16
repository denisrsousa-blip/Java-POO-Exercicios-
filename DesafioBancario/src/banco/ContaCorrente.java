package banco;

public class ContaCorrente extends Conta {

    // CONSTRUTOR ADICIONADO
    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        double total = valor + 2;
        if (getSaldo() >= total) {
            setSaldo(getSaldo() - total);
            System.out.println("Saque realizado com taxa de R$2");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void calcularRendimento() {
        System.out.println("Conta corrente não possui rendimento.");
    }
}