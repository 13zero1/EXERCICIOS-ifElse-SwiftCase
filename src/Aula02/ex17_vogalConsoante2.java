package Aula02;

import java.util.Scanner;

public class ex17_vogalConsoante2 {

    /*Ex17.
    Seu tio adorou o aplicativo que você construiu para o seu sobrinho porém ele também estuda programação e quer
    aprender como fazer o mesmo programa utilizando o switch case. Mostre para ele como se faz*/

    public static void main(String[] args) {

        //captura as entradas
        Scanner scan = new Scanner(System.in);

        //mostrar no console...
        System.out.print("Digite uma letra: ");
        String letra = scan.nextLine();

        switch (letra) {
            case "A":
            case "a":
                System.out.println(letra+" é uma vogal!");break;
            case "E":
            case "e":
                System.out.println(letra+" é uma vogal!");break;
            case "I":
            case "i":
                System.out.println(letra+" é uma vogal!");break;
            case "O":
            case "o":
                System.out.println(letra+" é uma vogal!");break;
            case "U":
            case "u":
                System.out.println(letra+" é uma vogal!");break;
            default:
                System.out.println(letra+" é uma consoante!");


        }

    }

}