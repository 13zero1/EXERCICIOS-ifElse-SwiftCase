package Aula02;

import java.util.Scanner;

public class ex11_masculinoFeminino {

    /* Ex11.
    Uma agência de viagens está com dificuldades e precisa dos seus serviços.
    Durante o cadastro, no momento de informar o sexo só poderá ser passada a letra F ou M.
    Todos estão contando com sua ajuda. Faça um programa que verifique se uma letra digitada é “F” ou “M”.
    Conforme a letra escrever: F - Feminino, M-masculino e caso não seja digitado nenhum dos dois imprima Sexo inválido
     */

        public static void main(String[] args) {

                //captura as entradas do console...
                Scanner scan = new Scanner(System.in);

                //mostrando no console...
                System.out.println("Digite ( M ) para masculino ou ( F ) para feminino: ");
                String genero = scan.nextLine();

                //mostrando a resposta
                if (genero.equalsIgnoreCase("M")) {
                    System.out.println("M - masculino");
                } else if (genero.equalsIgnoreCase("F")) {
                    System.out.println("F - feminino");
                } else {
                    System.out.println("Digite uma opção válida!");
                }

        }

}
