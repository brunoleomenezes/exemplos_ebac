public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", 5.5f);
        Aluno aluno2 = new Aluno("Jose", 7f);
        Aluno aluno3 = new Aluno("Maria", 8.5f);
        Aluno aluno4 = new Aluno("Paula", 1.5f);

        Aluno[] alunos = { aluno1, aluno2, aluno3, aluno4 };

        float media = calcularMedia(alunos);

        System.out.println("Média das notas: " + media);

        for (Aluno aluno : alunos) {
            aluno.displayDetails();
        }
    }

    private static float calcularMedia(Aluno[] alunos) {
        float soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        return soma / alunos.length;
    }
}
