package Aula02;

import java.util.Scanner;

public class ex10_saldoPositivoNegativo {

    /* Ex10.
    O banco da moderna te procurou, pois precisa que você implemente uma função no sistema.
    Quando o correntista pesquisar pelo saldo é necessário que mostre se o saldo é positivo ou negativo.
    Desenvolva um programa que peça um valor para o usuário digitar e mostre na tela o valor
    e se o saldo da conta é positivo ou negativo.*/

        public static void main(String[] args) {

                //captura as entradas do console...
                Scanner scan = new Scanner(System.in);

                double saldo = -1001.00;

                //mostrando no console...
                System.out.println("---- BANCO MODERNA ----");
                System.out.println("Digite ( 1 ) para visualizar o seu saldo");
                System.out.println("Digite ( 2 ) para realizar um deposito");

                int menu = scan.nextInt();

                if (menu == 1) {
                    System.out.println("Seu saldo é r$ "+saldo);

                        if (saldo > 0) {
                            System.out.println("seu saldo é positivo");
                        } else {
                            System.out.println("seu saldo é negativo");
                        }

                } else if (menu == 2) {
                    System.out.print("Digite o valor do depósito: r$ ");
                    double deposito = scan.nextInt();

                    double saldo2 = saldo + deposito;

                    System.out.println("Seu saldo atual é de r$ "+saldo2);

                        if (saldo2 > 0) {
                            System.out.println("seu saldo é positivo");
                        } else {
                            System.out.println("seu saldo é negativo");
                        }

                } else {
                    System.out.println("Digite uma opção válida");
                }

        }

}