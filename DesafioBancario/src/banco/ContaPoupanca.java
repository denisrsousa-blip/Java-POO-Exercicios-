package banco;

public class ContaPoupanca extends Conta {

    // CONSTRUTOR ADICIONADO
    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void calcularRendimento() {
        double rendimento = getSaldo() * 0.005;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento aplicado: " + rendimento);
    }
}