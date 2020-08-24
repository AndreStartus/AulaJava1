package Aula02.Entity;

public class Medico {
    public String nome;
    public String sobrenome;
    public String formacao;
    public String email;
    public int crm;

    public Medico(){//construtor default, já vem com a classe e não faz diferença (criar aqui) até ter sobrecarga de construtor
        //criando os 2 construtores eu posso usar os 2 (o implícito e o meu) otherwise eu só poderei usar o que foi declarado
        //
    }

    public Medico(String nome, String sobrenome, String formacao, String email, int crm){// isso é uma sobrecarga de contrutor
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.formacao = formacao;
    this.email = email;
    this.crm = crm;

    }

    public String retornaNomeCompleto() {
        return (nome + " " + sobrenome);
    }
}
