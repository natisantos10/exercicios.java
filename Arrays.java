package src;

import java.util.Scanner;

public class Exercicio3Aula10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];
        for (int i= 0; i < idades.length; i++){
            System.out.println("Informar a idade da pessoa de número " + i);
            idades[i] = scan.nextInt();
        }
        int quantidadeIdadesMaiores = 0;
        for (int idade: idades){
            if (idade >= 18){
                quantidadeIdadesMaiores++;
            }
        }
        System.out.println("Idades Computadas");
        for (int idade: idades){
            System.out.println(idade);
        }
        System.out.println("---");

        System.out.println("Quantidade de pessoas maiores de Idade " + quantidadeIdadesMaiores);
    }

}
