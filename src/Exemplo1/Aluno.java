package Exemplo1;

public class Aluno { //modela a classe - planejamento de como vai ser
    public String nome; //atributos
    public int idade;
    public String matricula;
    public String endereco;

    public void mostrainfodoalunoNaTela(){//método, o que o aluno faz
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Matricula: " + matricula);
        System.out.println("Endereco: " + endereco);
    }
}
