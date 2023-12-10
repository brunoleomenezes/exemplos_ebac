public class Aluno {
    // Atributos (variáveis de instância)
    private String nome;
    private float nota;

    // Construtor
    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Métodos (comportamentos)
    public void displayDetails() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
    }

    // Método para acessar a nota do aluno
    public float getNota() {
        return nota;
    }
}
