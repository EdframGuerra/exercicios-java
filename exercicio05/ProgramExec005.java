package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor do salario base: ");
        double salarioBase = leitor.nextDouble();

        System.out.print("Informe o valor do Salario do usuario: ");
        double salarioUsuario = leitor.nextDouble();

        Exercicio05 exercicio = new Exercicio05();

        System.out.printf("O usuario ganha: %.2f", exercicio.qtdSalario(salarioBase, salarioUsuario));
        System.out.println(", salários");
        leitor.close();
    }
}
