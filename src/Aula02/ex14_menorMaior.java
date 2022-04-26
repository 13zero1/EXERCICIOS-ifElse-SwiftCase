package Aula02;

import java.util.Scanner;

public class ex14_menorMaior {

    /* Ex14.
    Godofreda voltou com outro desafio e ela acredita que agora você não vai conseguir.
    Ela te desafiou a escrever 5 números e o computador descobrir qual o maior e qual o menor.
    Desenvolva esse programa e prove para ela o contrário. */

        public static void main(String[] args) {

                //captura as entradas do console...
                Scanner scan = new Scanner(System.in);

                //mostrar no console...
                System.out.print("Digite o 1. numero: ");
                int num1 = scan.nextInt();

                int maior = num1;
                int menor = num1;

                System.out.print("Digite o 2. numero: ");
                int num2 = scan.nextInt();

                if (num2 > maior) {
                    maior = num2;
                };

                if (num2 < menor) {
                    menor = num2;
                }

                System.out.print("Digite o 3. numero: ");
                int num3 = scan.nextInt();

                if (num3 > maior) {
                    maior = num3;
                };

                if (num3 < menor) {
                    menor = num3;
                }

                System.out.print("Digite o 4. numero: ");
                int num4 = scan.nextInt();

                if (num4 > maior) {
                    maior = num4;
                };

                if (num4 < menor) {
                    menor = num4;
                }

                System.out.print("Digite o 5. numero: ");
                int num5 = scan.nextInt();

                if (num5 > maior) {
                    maior = num5;
                };

                if (num5 < menor) {
                    menor = num5;
                }

            //mostrando o resultado...
    //        if (num1>=num2 && num2>=num3 && num3>=num4 && num4>=num5) {
    //            System.out.print (num1+" é o maior numero que vc digitou!");
    //            System.out.print ("\n"+num5+" é o menor numero que vc digitou!");
    //
    //        } else if (num2>num3 && num3>num4 && num4>num5 && num5>num1) {
    //            System.out.print (num2+" é o maior numero que vc digitou!");
    //            System.out.print ("\n"+num1+" é o menor numero que vc digitou!");
    //
    //        } else if (num3>num4 && num4>num5 && num5>num1 && num1>num2) {
    //            System.out.print (num3+" é o maior numero que vc digitou!");
    //            System.out.print ("\n"+num2+" é o menor numero que vc digitou!");
    //
    //        } else if (num4>num5 && num5>num1 && num1>num2 && num2>num3) {
    //            System.out.print (num4+" é o maior numero que vc digitou!");
    //            System.out.print ("\n"+num3+" é o menor numero que vc digitou!");
    //
    //        } else if (num5>num1 && num1>num2 && num2>num3 && num3>num4) {
    //            System.out.print (num5+" é o maior numero que vc digitou!");
    //            System.out.print ("\n"+num4+" é o maior numero que vc digitou!");
    //        } else {
    //            System.out.println(" fim ");
    //        }
    //

            System.out.println("O menor numero digitado foi "+menor);
            System.out.println("O maior numero digitado foi "+maior);

        }


}