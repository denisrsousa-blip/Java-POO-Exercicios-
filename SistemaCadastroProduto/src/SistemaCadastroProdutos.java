import java.util.ArrayList;

public class SistemaCadastroProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Livro("Java para Iniciantes", 100.00, "Programação"));
        produtos.add(new Eletronico("Smartphone XYZ", 2000.00, "Eletrônicos"));
        produtos.add(new Alimento("Arroz Integral", 25.00, "Alimentação"));

        System.out.println("=== CADASTRO DE PRODUTOS ===\n");

        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNome());
            System.out.println("Categoria: " + p.getCategoria());
            System.out.printf("Preço original: R$ %.2f%n", p.getPreco());
            System.out.printf("Desconto: R$ %.2f%n", p.calcularDesconto());
            System.out.printf("Preço com desconto: R$ %.2f%n", p.getPreco() - p.calcularDesconto());
            System.out.println("------------------------");
        }
    }
}