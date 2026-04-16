public class Livro extends Produto {
    public Livro(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.10;
    }
}