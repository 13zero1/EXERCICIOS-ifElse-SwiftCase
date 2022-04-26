package Aula02;

import java.util.Scanner;

public class ex03_somaSimples {

    /*Ex3.
    Faça um programa que peça dois números e imprima a soma deles e imprima no console:
    A soma dos números [X] e [Y] é: [valor].*/

        public static void main(String[] args) {

            Scanner scan = new Scanner (System.in);

            //mostra no console
            System.out.print("digite um número: ");
            int num1 = scan.nextInt();

            System.out.print("digite outro número: ");
            int num2 = scan.nextInt();

            //informa o resultado
            System.out.println("A soma dos números " + num1 + " e " + num2 + " é " + (num1 + num2) );

        }

}