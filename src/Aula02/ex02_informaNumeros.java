package Aula02;

import java.util.Scanner;

public class ex02_informaNumeros {

    /*Ex2.
    Faça um programa que peça um número e mostre a mensagem:
    O número informado foi [número]*/

        public static void main (String[]args) {
            Scanner scan = new Scanner (System.in);

            //mostra no console
            System.out.println("Informe um número: ");
            int num= scan.nextInt();

            //imprimi o resultado
            System.out.println("o número informado foi " + num);

        }

}
