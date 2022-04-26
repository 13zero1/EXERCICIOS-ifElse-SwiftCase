package Aula02;

import java.util.Scanner;

public class ex06_desafiosMatematicos {

    /*EX06
    Um professor de matemática te desafiou a criar um programa que faça alguns cálculos.
    Desenvolva um programa que peça 2 números inteiros e um número real e faça as seguintes operações:
    A) O produto do dobro do primeiro com metade do segundo.
    B) A soma do triplo do primeiro com o terceiro.
    C) O terceiro elevado ao cubo */

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            //mostrando as perguntas no console
            System.out.print("Digite um numero inteiro: ");
            int num1 = scan.nextInt();

            System.out.print("Digite outro numero inteiro: ");
            int num2 = scan.nextInt();

            System.out.print("Digite outro numero real: ");
            double num3 = scan.nextDouble();

            //letra A
            int resp1 = (2*num1)*(num2/2);
            //letra B
            double resp2 = (3*num1)+num3;
            //letra C
            double resp3 = num3*num3*num3;

            //mostrando as respostas no console
            System.out.println("\nos numero informados foram: "+num1+", "+num2+" e "+num3);
            System.out.println("A) O produto do dobro do primeiro com metade do segundo é "+resp1);
            System.out.println("B) A soma do triplo do primeiro com o terceiro é "+resp2);
            System.out.println("C) O terceiro elevado ao cubo é "+resp3);

        }

}