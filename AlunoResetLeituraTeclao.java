package src;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {

            public static void main(String[] args) {
                System.out.println("Nome: ");
                Scanner sc = new Scanner(System.in);
                String nome = sc.nextLine();
                System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + nome);
            }



        }
