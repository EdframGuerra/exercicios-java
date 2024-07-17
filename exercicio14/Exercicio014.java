package exercicio14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio014 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor A: ");
        int valorA = leitor.nextInt();

        System.out.print("Informe o valor B: ");
        int valorB = leitor.nextInt();


        int x = valorA;
        valorA = valorB;
        valorB = x;

        System.out.printf("Valor A: %d, Valor B: %d", valorA, valorB);

        leitor.close();
    }
}
