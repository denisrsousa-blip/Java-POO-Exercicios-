public class Aluno extends Pessoa {
    // Atributo extra específico do Aluno
    private String matricula;

    // Construtor
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);  // Chama o construtor da classe mãe (Pessoa)
        this.matricula = matricula;
    }

    // Getter e Setter para matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Implementação obrigatória do método abstrato
    @Override
    public void apresentar() {
        System.out.println("Sou o aluno " + getNome() + ", tenho " + getIdade() + " anos, matrícula " + matricula + ".");
    }
}
