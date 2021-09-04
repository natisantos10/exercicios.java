package src;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero que deseje gerar a Tabuada: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada do " + numero);

        for ( int i = 1; i <=10; i ++) {
            System.out.println(numero + "x" + i +  "=" + numero * i );
        }
    }
}
