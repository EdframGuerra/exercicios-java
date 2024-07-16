package exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valorA = leitor.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valorB = leitor.nextInt();

        if (valorB == valorA) {
            System.out.print("Digite o segundo valor: ");
            valorB = leitor.nextInt();
        }

        System.out.print("Digite o terceiro valor: ");
        int valorC = leitor.nextInt();

        if (valorC == valorA || valorC == valorB) {
            System.out.print("Digite o terceiro valor: ");
            valorC = leitor.nextInt();
        }

        if (valorA > valorB && valorA > valorC) {
            if (valorB > valorC) {
                System.out.println(valorA + ", " + valorB + ", " + valorC);
            }
        }
        if (valorB > valorA && valorB > valorC) {
            if (valorA < valorC) {
                System.out.println(valorB + " , " + valorA + ", " + valorC);
            }
        } else if (valorA > valorC && valorA > valorB) {
            if (valorC > valorB) {
                System.out.println(valorA + " , " + valorC + ", " + valorB);
            }
        } else if (valorB > valorC && valorB > valorA) {
            if (valorC > valorA) {
                System.out.println(valorB + " , " + valorC + ", " + valorA);
            }
        } else if (valorC > valorA && valorC > valorB) {
            if (valorA > valorB) {
                System.out.println(valorC + " , " + valorA + ", " + valorB);
            }
        } else {
            System.out.println(valorC + " , " + valorB + ", " + valorA);
        }

        leitor.close();

    }
}