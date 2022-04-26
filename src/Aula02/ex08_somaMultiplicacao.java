package Aula02;

import java.util.Scanner;

public class ex08_somaMultiplicacao {
    
    /*EX08.
    Um professor de cálculo precisa de sua ajuda em sua aula. 
    O celular dele quebrou e ele está sem dinheiro para comprar uma calculadora.
    Você como um bom amigo ofereceu a seguinte ajuda. Desenvolva um programa que:
        A) Receba dois valores;
        B) Faça a soma dos dois valores;
        C) Faça a multiplicação dos dois valores;
        D) Verifique se a soma é igual a multiplicação;
        E) Exiba no console as respostas das letras B, C e D.*/

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                //mostrando as perguntas no console
                System.out.print("Digite um numero: ");
                int num1 = scan.nextInt();

                System.out.print("Digite outro numero: ");
                int num2 = scan.nextInt();

                //calculando...
                int resp1 = num1+num2;
                int resp2 = num1*num2;


                //mostrando as respostas...
                System.out.println("\nos números digitados foram "+num1+" e "+ num2);
                System.out.println("\n"+num1+" + "+ num2+ " = "+ resp1);
                System.out.println(num1+" x "+ num2+ " = "+ resp2);

                    if (resp1 == resp2) {
                        System.out.println(resp1 + " e " + resp2 + " sao iguais!");
                    } else {
                        System.out.println(resp1 + " e " + resp2 + " não sao iguais!");
                    }

        }
    
}