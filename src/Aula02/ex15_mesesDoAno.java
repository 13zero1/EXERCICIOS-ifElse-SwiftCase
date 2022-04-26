package Aula02;

import java.util.Scanner;

public class ex15_mesesDoAno {

    /*Ex15.
    Escreva um programa que receba um número entre 1 e 12 e mostre na tela o mês de acordo com o número digitado.
    Caso o valor não seja entre 1 e 12 mostre na tela: mês informado não existe.*/

        public static void main(String[] args) {

                //captura as entradas...
                Scanner scan = new Scanner(System.in);

                //mostrar no console...
                System.out.print("Digite um numero de 1 - 12: ");
                int mes = scan.nextInt();

                switch (mes) {
                    case 1:
                        System.out.println("1 - Janeiro"); break;
                    case 2:
                        System.out.println("2 - Fevereiro"); break;
                    case 3:
                        System.out.println("3 - Março"); break;
                    case 4:
                        System.out.println("4 - Abril"); break;
                    case 5:
                        System.out.println("5 - Maio"); break;
                    case 6:
                        System.out.println("6 - Junho"); break;
                    case 7:
                        System.out.println("7 - Julho"); break;
                    case 8:
                        System.out.println("8 - Agosto"); break;
                    case 9:
                        System.out.println("9 - Setembro"); break;
                    case 10:
                        System.out.println("10 - Outubro"); break;
                    case 11:
                        System.out.println("11 - Novembro"); break;
                    case 12:
                        System.out.println("12 - Dezembro"); break;
                    default:
                        System.out.println("mês informado não existe");
                }

        }

}