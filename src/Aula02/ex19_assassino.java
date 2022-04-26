package Aula02;

import java.util.Scanner;

public class ex19_assassino {

    /*Ex19.
    Um detetive precisa que você faça um programa que o ajude a descobrir quem praticou o crime.
    O programa deve conter 5 perguntas:
        1) Telefonou para a vítima?
        2) Esteve no local do crime?
        3) Mora perto da vítima?
        4) Devia para a vítima?
        5) Já trabalhou com a vítima?
    O programa deve emitir uma classificação sobre a participação no crime.
    Se ela responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
    entre 3 e 4 como “Cúmplice” e 5 como “Assassino”.
    Caso contrário, ela será tida como inocente.
        *É obrigatório o uso do switch case.*/

    public static void main(String[] args) {

        //captura a entrada
        Scanner scan = new Scanner(System.in);

        int resultado = 0;

        //mostrar no console...
        System.out.println(" > > > INTERROGATÓRIO < < < ");
        System.out.println("1 - Telefonou para a vítima?");
        System.out.println("S-SIM ou N-NAO");
        String resp1 = scan.nextLine();
        if (resp1.equalsIgnoreCase("S")) {
            resultado++;
        } else {

        }

        System.out.println("2 - Esteve no local do crime?");
        System.out.println("S-SIM ou N-NAO");
        String resp2 = scan.nextLine();
        if (resp2.equalsIgnoreCase("S")) {
            resultado++;
        } else {

        }

        System.out.println("3 - Mora perto da vítima?");
        System.out.println("S-SIM ou N-NAO");
        String resp3 = scan.nextLine();
        if (resp3.equalsIgnoreCase("S")) {
            resultado++;
        } else {

        }

        System.out.println("4 - Devia para a vítima?");
        System.out.println("S-SIM ou N-NAO");
        String resp4 = scan.nextLine();
        if (resp4.equalsIgnoreCase("S")) {
            resultado++;
        } else {

        }

        System.out.println("5 - DJá trabalhou com a vítima?");
        System.out.println("S-SIM ou N-NAO");
        String resp5 = scan.nextLine();
        if (resp5.equalsIgnoreCase("S")) {
            resultado++;
        } else {

        }

        switch (resultado) {

            case (2):
                System.out.println("Suspeita"); break;

            case (3):
            case (4):
                System.out.println("Cumplice"); break;

            case (5):
                System.out.println("Assassino"); break;

            default:
                System.out.println("Inocente");

        }

    }

}