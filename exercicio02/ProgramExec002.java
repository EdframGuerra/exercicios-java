package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec002 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leitor.nextInt();

        Exercicio02 exercicio = new Exercicio02();

        if (exercicio.par(numero) == 0) {
            System.out.println("Numero par");

        } else {
            System.out.println("Numero impar");
        }

        if(numero <0){
            System.out.println("Numero negativo");
        }
        else {
            System.out.println("Numero positivo");
        }

        leitor.close();
    }
}
