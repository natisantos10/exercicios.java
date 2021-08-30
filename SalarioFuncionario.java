package src;

import java.util.Scanner;

public class salario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Funcionario:");
            String nome = scan.nextLine();

        System.out.println("Salário:");
           String salario = scan.nextLine();

         System.out.println("O Funcionario "+ nome + "tem um salario de R$" + salario + " em Junho!");
    }
}
