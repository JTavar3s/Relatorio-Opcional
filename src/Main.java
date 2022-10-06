public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("tavares", "joaozinhapqd33gameplay", "lokoporti321","farmacia", 777);
        Professor professor = new Professor("james bondy","jamesprof1422","jefballa");

        aluno.fazerLogin("joaozinhapqd33gameplay","lokoporti321");
        professor.fazerLogin("jamesprof1422","jefballa");

        professor.publicarNota(aluno);

    }


}
