package Aula02;

import java.util.Scanner;

public class ex07_parOuImpar {

    /*EX07.
    Sua amiga Ana precisa de sua ajuda. Ela pensou em alguns números e quer saber se é um número par ou ímpar.]
    Você como desenvolvedor disse que poderia ajudá-la.
    Crie um programa que receba um número e mostre no console se o mesmo é ímpar ou par.*/

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            //mostrar a pergunta no console
            System.out.print("Digite um numero inteiro: ");
            int num = scan.nextInt();


            int resp = num%2;

            if (resp == 0){
                System.out.println(num + " é par");
            }   System.out.println(num + " é impar");

        }

}