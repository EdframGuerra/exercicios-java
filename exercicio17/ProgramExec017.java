package exercicio17;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a teperatura Fahrenheit: ");
        double fahrenheit = leitor.nextDouble();

        double celsius = (5 * (fahrenheit - 32) / 9);

        System.out.printf("Temperatura de %.0f " , fahrenheit);
        System.out.print("graus fahrenheit, corresponde a ");
        System.out.printf("%.2f",  celsius);
        System.out.print(" graus Celsius");

        leitor.close();
    }
}
