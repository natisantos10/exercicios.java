package src;

import java.util.Scanner;

public class QualSeuNome {
    public static void main(String[] args){
        System.out.println("Qual é o seu nome? ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Olá " + nome+", é um prazer te conhcer!");

    }
}
