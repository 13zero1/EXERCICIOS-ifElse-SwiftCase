package Aula02;

import java.util.Scanner;

public class ex18_bomDIa {

    /*Ex18.
    Faça um programa que pergunte em que turno você estuda.
    Peça para digitar M (matutino) ou V (Vespertino) ou N (Noturno).
    Imprima a mensagem de Bom dia, Boa tarde, Boa noite ou Valor inválido, conforme o caso.*/

    public static void main(String[] args) {

        //captura a entrada
        Scanner scan = new Scanner(System.in);

        //mostrar no console...
        System.out.print("Digite ( M ) para MANHÃ, ( V ) para VESPERTINO e ( N ) para NOTURNO: ");
        String letra = scan.nextLine();

        switch (letra) {
            case ("M"):
            case ("m"):
                System.out.println("bom dia!"); break;
            case ("V"):
            case ("v"):
                System.out.println("boa tarde!"); break;
            case ("N"):
            case ("n"):
                System.out.println("boa noite!"); break;
            default:
                System.out.println("Valor inválido");
        }

    }

}