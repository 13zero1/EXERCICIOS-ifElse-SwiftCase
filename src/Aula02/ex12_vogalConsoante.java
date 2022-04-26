package Aula02;

import java.util.Scanner;

public class ex12_vogalConsoante {

    /*Ex12.
    Você está ensinando o seu sobrinho a ler e escrever. Ele precisa aprender o que é vogal e consoante
    e seu tio deu a ideia de usar o computador para isso. Desenvolva um programa que verifique se
    uma letra digitada é vogal ou consoante. Imprima na tela a resposta completa para o seu sobrinho*/

        public static void main(String[] args) {

                //captura as entradas do console...
                Scanner scan = new Scanner(System.in);

                //mostrar no console...
                System.out.print("Digite uma letra: ");
                String letra = scan.nextLine();

                //mostrar a resposta...
                if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") ||
                        letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") ||
                                letra.equalsIgnoreCase("U")) {
                    System.out.println(letra +" é uma vogal!");
                } else {
                    System.out.println(letra + " é uma consoante!");

                }

        }

}