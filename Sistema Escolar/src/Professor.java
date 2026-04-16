public class Professor extends Pessoa {
    // Atributo extra específico do Professor
    private String disciplina;

    // Construtor
    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);  // Chama o construtor da classe mãe (Pessoa)
        this.disciplina = disciplina;
    }

    // Getter e Setter para disciplina
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Implementação obrigatória do método abstrato
    @Override
    public void apresentar() {
        System.out.println("Sou o professor " + getNome() + ", leciono " + disciplina + ".");
    }
}