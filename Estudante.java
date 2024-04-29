import Models.Aluno;

public class Estudante {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno();
        aluno.setNome("Carlão");
        aluno.setEscola("Una");
        aluno.setPresenca(75);

        System.out.println(aluno.getNome());
        System.out.println(aluno.getEscola());
        System.out.println(aluno.getPresenca());
}
}