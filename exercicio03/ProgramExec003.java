package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec003 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = leitor.nextInt();

        System.out.print("Digite um numero: ");
        int b = leitor.nextInt();

        Exercicio03 exercicio = new Exercicio03();

        int c;

        if (a == b) {

            c = exercicio.soma(a, b);
            System.out.println(c);
        } else {
            c = exercicio.multiplica(a, b);
            System.out.println(c);
        }

        leitor.close();
    }
}
