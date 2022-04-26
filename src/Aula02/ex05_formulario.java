package Aula02;

import java.util.Scanner;

public class ex05_formulario {

    /*Ex5.
    Crie um sistema que preencha um formulário com as seguintes informações:
    nome, idade, cpf, gênero, email, telefone, rua, número, bairro e cidade.
    onde todos devem ser recebidos pelo Scanner*/

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            //mostrando as perguntas no console
            System.out.print("Nome: ");                    //nome
            String nomeUsuario = scan.nextLine();

            System.out.print("Idade: ");                    //idade
            int idadeUsuario = scan.nextInt();

            System.out.print("CPF: ");                     //cpf
            long cpfUsuario = scan.nextLong();

            System.out.print("Gênero: ");                  //genero
            String generoUsuario = scan.next();

            System.out.print("Email: ");                   //email
            String emailUsuario = scan.next();

            System.out.print("DDD: ");                     //ddd
            int dddUsuario = scan.nextInt();

            System.out.print("Telefone: ");                //telefone
            int telefoneUsuario = scan.nextInt();

            System.out.print("Rua: ");                     //rua
            String ruaUsuario = scan.next();
            scan.nextLine(); //usando pra nao passar direto pra próxima pergunta

            System.out.print("Numero: ");                  //numero
            int numeroUsuario = scan.nextInt();

            System.out.print("Bairro: ");                  //bairro
            String bairroUsuario = scan.next();

            System.out.print("Cidade: ");                  //cidade
            String cidadeUsuario = scan.next();
            scan.nextLine();    //usando pra nao passar direto

            //vai mostrar no console
            System.out.println("\n------ FORMULÁRIO DA MODERNA ------");
            System.out.println("Nome: " + nomeUsuario);
            System.out.println("Idade: " + idadeUsuario);
            System.out.println("CPF: " + cpfUsuario);
            System.out.println("Gênero: " + generoUsuario);
            System.out.println("Email: " + emailUsuario);
            System.out.println("Telefone: " + dddUsuario + " " + telefoneUsuario);

            System.out.println("\n------ ENDEREÇO ------");
            System.out.println("Rua: "+ruaUsuario);
            System.out.println("Numero: "+numeroUsuario);
            System.out.println("Bairro: "+bairroUsuario);
            System.out.println("Cidade: "+cidadeUsuario);
            System.out.println(" ");
            System.out.println("-----------------------");

        }

}