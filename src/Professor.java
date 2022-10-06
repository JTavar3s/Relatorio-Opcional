public class Professor extends Usuario implements Funcionario {


    public Professor(String nome, String login, String senha) {
        super(nome, login, senha);

    }

    public void publicarNota(Aluno aluno){

        System.out.println("nota publicada do aluno: " + aluno.getNome());
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void fazerLogin(String login, String senha){

        if(this.login.equals(login) && this.autenticar(senha)){
            System.out.println("login realizado com sucesso");
        }else{
            System.out.println("Erro");
        }
    }
}
