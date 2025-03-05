package classeatributo;

public class ClasseAtributo {

    public static void main(String[] args) {
        Atributo a1 = new Atributo();
        Aluno aluno = new Aluno();
        aluno.idade = "10 anos";
        aluno.Exibir();
        aluno.setIdade("15 anos");
        aluno.Exibir();
    }

}
