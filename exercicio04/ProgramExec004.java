package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec004 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leitor.nextInt();

        Exercicio04 exercicio = new Exercicio04();

        System.out.println("Antecessor: "+ exercicio.antecessor(numero));
        System.out.println("Sucessor: "+ exercicio.sucessor(numero));

        leitor.close();
        
    }
}
