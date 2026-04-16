public class Eletronico extends Produto {
    public Eletronico(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.05;
    }
}