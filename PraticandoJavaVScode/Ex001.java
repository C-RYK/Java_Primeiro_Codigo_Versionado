package JavaVScode;

import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) throws Exception{
        
        //Scanner para captura de dados aberto
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual seu nome?: ");
        String nome = entrada.nextLine();

        System.out.println("É um prazer conhecer você " + nome);

        //Escaner fechado
        entrada.close();
    }
}
