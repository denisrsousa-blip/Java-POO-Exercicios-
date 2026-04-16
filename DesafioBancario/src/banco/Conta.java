package banco;

public abstract class Conta {
        private int numero;
        private double saldo;

        // CONSTRUTOR ADICIONADO
        public Conta(int numero, double saldo) {
                this.numero = numero;
                this.saldo = saldo;
        }

        public int getNumero() {
                return numero;
        }

        public double getSaldo() {
                return saldo;
        }

        protected void setSaldo(double saldo) {
                if (saldo >= 0) {
                        this.saldo = saldo;
                } else {
                        System.out.println("Saldo não pode ser negativo!");
                }
        }

        public void depositar(double valor) {
                if (valor > 0) {
                        setSaldo(getSaldo() + valor);
                }
        }

        public abstract void sacar(double valor);
        public abstract void calcularRendimento();
}
