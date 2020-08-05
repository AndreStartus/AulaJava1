package Exemplo1;

public class Professor {
    public String nome;
    public int idade;
    public String disciplina;
    public String endereco;

    public void mostrainfodoProfessorNaTela() {//método, o que o professor faz

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + disciplina);
        System.out.println("Endereco: " + endereco);
    }
}
