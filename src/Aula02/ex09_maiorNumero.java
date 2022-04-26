package Aula02;

import java.util.Scanner;

public class ex09_maiorNumero {

    /*EX09.
    Godofreda não acredita em tecnologia e diz ser impossível que o computador saiba de tudo.
    Ela te desafiou a pensar em dois números e o computador conseguir dizer qual o maior entre eles.
    Faça um programa que peça dois números e imprima o maior deles.*/

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                //mostrando as perguntas no console
                System.out.print("Digite um numero inteiro: ");
                int num1 = scan.nextInt();

                System.out.print("Digite outro numero inteiro: ");
                int num2 = scan.nextInt();

                //mostrando resultado...
                System.out.println("\nOs numeros digitados foram: "+num1+" e "+num2);

                    if (num1 > num2) {
                        System.out.println("onde "+num1+" é maior que "+num2);
                    } else {
                        System.out.println("onde "+num2+" é maior que "+num1);
                    }

        }

}