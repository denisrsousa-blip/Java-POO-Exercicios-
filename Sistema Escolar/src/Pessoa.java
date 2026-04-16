public abstract class Pessoa {
    // Atributos (características)
    private String nome;
    private int idade;

    // Construtor (método que inicializa o objeto)
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters (métodos para acessar e modificar os atributos)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método abstrato (sem corpo, será implementado nas subclasses)
    public abstract void apresentar();
}