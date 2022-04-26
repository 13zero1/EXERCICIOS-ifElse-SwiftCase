package Aula02;

import java.util.Scanner;

public class ex04_notasMedia {

    /*Ex4.
    Você foi contratado por uma escola e seu primeiro trabalho é desenvolver um
    programa que armazena as notas das 4 unidades e mostre a média final do aluno. O
    console deverá informar as notas e a média final.*/

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            //vai mostrar no console
            System.out.print("Digite a nota 1:");
            double nota1 = scan.nextDouble();
            System.out.print("Digite a nota 2:");
            double nota2 = scan.nextDouble();
            System.out.print("Digite a nota 3:");
            double nota3 = scan.nextDouble();
            System.out.print("Digite a nota 4:");
            double nota4 = scan.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4)/4;

            //vai mostrar no console
            System.out.println("\nSuas notas foram "+ nota1 +", "+ nota2 +", "+ nota3 +" e "+ nota4);
            System.out.println("Sua media final é de "+ media);
        }

}