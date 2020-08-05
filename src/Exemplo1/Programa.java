package Exemplo1;

public class Programa {
    public static void main(String[] args){
        //String nome = "Andre";
        Aluno aluno1 = new Aluno(); //objeto, variável do tipo aluno, momento em que se cria o aluno
        Aluno aluno2 = new Aluno();
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();

        aluno1.nome = "Jose";
        aluno1.idade = 20;
        aluno1.matricula = "12345";
        aluno1.endereco = "Brasil";

        aluno2.nome = "Maria";
        aluno2.idade = 30;
        aluno2.matricula = "67890";
        aluno2.endereco = "Canada";

        professor1.nome = "Cosme";
        professor1.idade = 50;
        professor1.disciplina = "Matemática";
        professor1.endereco = "China";

        professor2.nome = "Damiao";
        professor2.idade = 50;
        professor2.disciplina = "Português";
        professor2.endereco = "Japão";

        aluno1.mostrainfodoalunoNaTela();
        System.out.println("*****************************");
        aluno2.mostrainfodoalunoNaTela();
        System.out.println("*****************************");
        professor1.mostrainfodoProfessorNaTela();
        System.out.println("*****************************");
        professor2.mostrainfodoProfessorNaTela();

    }
}
