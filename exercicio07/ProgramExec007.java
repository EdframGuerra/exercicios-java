package exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec007 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe seu nome e Sobre nome: ");
        String nome = leitor.nextLine();
      
       System.out.print("Informe sua idade: ");
       int idade = leitor.nextInt();


       System.out.print("Informe sua altura: ");
       double altura = leitor.nextDouble();

       if(idade<10 || altura < 1.40){
        System.out.println(nome + ", Acesso proibido!");
       }
       else{
        System.out.println(nome + ", Acesso permitido!");
       }

        leitor.close();
    }
}
