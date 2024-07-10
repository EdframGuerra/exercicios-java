package exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec006 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        int valor = leitor.nextInt();

        System.out.print("Informe o valor da taxa: ");
        int taxa = leitor.nextInt();

        Exercicio06 exercicio = new Exercicio06();

        System.out.printf("O valor final é R$: %.2f", exercicio.valorTotal(valor, taxa));
        

        leitor.close();
    }
}
