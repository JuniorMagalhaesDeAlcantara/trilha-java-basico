package edu.junior.anatomiadeclasses;

public class aboutMe {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = args[2];
        double altura = args[3];

        System.out.println("Ola meu nome é " + nome + sobrenome);
        System.out.println("Tenho " + idade +" de idade");
        System.out.println(" e  " + altura + "de altura");
    }
}
