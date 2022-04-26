package Aula02;

import java.util.Scanner;

public class ex13_voto {

    /*Ex13.
    Um amigo seu te procurou para tirar uma dúvida.
    Ele tem 3 filhos com idades diferentes e não sabe se eles podem ou não votar nas eleições de 2022.
    Faça um programa que o usuário passe sua idade e ele diga se o voto é obrigatório, proibido ou facultativo.
    dica:
    - abaixo de 16 = proibido
    - entre 16 e menos de 18 ou acima de 70 facultativo
    - De 18 pra cima e abaixo de 70 é obrigatório.
     */

        public static void main(String[] args) {

                //captura as entradas do console...
                Scanner scan = new Scanner(System.in);

                //mostrar no console...
                System.out.print("Digite a sua idade: ");
                int ano = scan.nextInt();

                //mostrar o resultado...
                if (ano < 16) {
                    System.out.println("Voto Proibido");

                } else if (ano >= 16 && ano < 18 || ano >= 70 ) {
                    System.out.println("voto facultativo");

                } else {
                    System.out.println("voto obrigatório");
                }

        }

}