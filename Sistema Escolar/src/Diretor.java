public class Diretor extends Pessoa {
    // Atributo extra específico do Diretor
    private int tempoDeGestao;

    // Construtor
    public Diretor(String nome, int idade, int tempoDeGestao) {
        super(nome, idade);  // Chama o construtor da classe mãe (Pessoa)
        this.tempoDeGestao = tempoDeGestao;
    }

    // Getter e Setter para tempoDeGestao
    public int getTempoDeGestao() {
        return tempoDeGestao;
    }

    public void setTempoDeGestao(int tempoDeGestao) {
        this.tempoDeGestao = tempoDeGestao;
    }

    // Implementação obrigatória do método abstrato
    @Override
    public void apresentar() {
        System.out.println("Sou o diretor " + getNome() + ", há " + tempoDeGestao + " anos na gestão.");
    }
}