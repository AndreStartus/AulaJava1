package Aula02;

import Aula02.Entity.Medico;

public class Program {
    public static void main(String[] args) {
    Medico medico1 = new Medico();
    medico1.nome = "Joao";
    medico1.sobrenome = "bobao";
    //medico1.clinica = "centro";
    System.out.println(medico1.retornaNomeCompleto());
    Medico medico2 = new Medico("Jose", "Maria", "Cirurgiao", "jm@gmail.com", 123 );
    System.out.println(medico2.nome);
    System.out.println(medico2.sobrenome);
        System.out.println(medico2.formacao);
        System.out.println(medico2.email);
        System.out.println(medico2.crm);
        
    }

}
