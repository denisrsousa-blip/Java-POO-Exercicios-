import java.util.ArrayList;

public class Escola {
    public static void main(String[] args) {
        // Criando a lista que vai guardar todas as pessoas (polimorfismo!)
        ArrayList<Pessoa> cadastro = new ArrayList<>();

        // Adicionando alunos
        cadastro.add(new Aluno("João Silva", 15, "2024001"));
        cadastro.add(new Aluno("Ana Costa", 16, "2024002"));

        // Adicionando professores
        cadastro.add(new Professor("Maria Oliveira", 42, "Matemática"));
        cadastro.add(new Professor("Roberto Lima", 38, "História"));

        // Adicionando diretor
        cadastro.add(new Diretor("Carlos Souza", 55, 8));

        // Exibindo o cadastro completo
        System.out.println("=== CADASTRO DA ESCOLA ===\n");

        // Percorrendo a lista e chamando o método apresentar() de cada um
        for (Pessoa p : cadastro) {
            p.apresentar();
        }
    }
}