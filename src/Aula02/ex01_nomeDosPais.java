package Aula02;

import java.util.Scanner;

public class ex01_nomeDosPais {

/*Ex1.
Você está aprendendo a programar e quer impressionar o seu amigo.
Desenvolva um programa que peça para ele digitar os nomes dos pais e
suas respectivas idades e depois imprima no console.*/

        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);

        //DADOS DO PAI
        System.out.print("Qual é o nome do seu pai?   R.: ");
        String nomePai = scan.nextLine();

        System.out.print("Qual é a idade dele?   R.: ");
        String idadePai = scanNum.nextLine();

        // DADOS DA MAE
        System.out.println(" ");
        System.out.print("Qual é o nome da sua mãe?   R.: ");
        String nomeMae = scan.nextLine();

        System.out.print("Qual é a idade dela?   R.: ");
        String idadeMae = scanNum.nextLine();

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - Imprimir as respostas

        System.out.println(" ");
        System.out.println("Pai: " + nomePai + " - idade: " + idadePai + " anos.");
        System.out.println("Mãe: " + nomeMae + " - idade: " + idadeMae + " anos.");

        }
}