package Aula02;

import java.util.Scanner;

public class ex16_cadastrarImprimir {

    /*Ex16.
    Uma faculdade te contratou para criar um sistema de cadastro de alunos.
    Crie um programa com as seguintes opções de fluxo:
        (1) Cadastrar aluno
        (2) Cadastrar endereço
        (3) Imprimir aluno
        (4) Imprimir Endereço
        (5) Sair
    Para cada opção imprima apenas o verbo "Cadastrando…" ou "Imprimindo..."*/

    public static void main(String[] args) {

        //captura as entradas
        Scanner scan = new Scanner(System.in);

        //mostrar no console...
        System.out.println("> > > FACULDADE MODERNA < < <");
        System.out.println("Digite ( 1 ) para cadastrar aluno");
        System.out.println("Digite ( 2 ) para cadastrar endereço");
        System.out.println("Digite ( 3 ) para imprimir aluno");
        System.out.println("Digite ( 4 ) para imprimir endereço");
        System.out.println("Digite ( 5 ) para sair");
        System.out.print("--------------------------------------> ");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
            case 2:
                System.out.println("Cadastrando..."); break;
            case 3:
            case 4:
                System.out.println("Imprimindo..."); break;
            case 5:
                System.out.println("Saindo..."); break;
            default:
                System.out.println("Digite uma opção válida!");
        }
    }
}