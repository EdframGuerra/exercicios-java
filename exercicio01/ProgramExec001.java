package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec001 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o numero A: ");
        int numeroA = leitor.nextInt();

        System.out.print("Digite o numero B: ");
        int numeroB = leitor.nextInt();

        System.out.print("Digite o numero C: ");
        int numeroC = leitor.nextInt();

        Exercicio01 exercicio = new Exercicio01();

        System.out.println(" Soma de A+B = " + exercicio.soma(numeroA, numeroB));
        System.out.println("Numero C = " + numeroC);

        if (exercicio.soma(numeroA, numeroB) > numeroC) {
            System.out.println("A soma dos numeros A e B não é menor que o numero C");
        } else if (exercicio.soma(numeroA, numeroB) == numeroC) {
            System.out.println("A soma dos numeros A e B não é menor que o numero C");
        } else {
            System.out.println("A soma dos numeros A e B é menor que o numero C");
        }

        leitor.close();
    }
}
