package exercicio23;

import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("DEMONSTRATIVO SALARIO PROFESSOR");
        System.out.print("Informe valor hora: ");
        double valorHora = leitor.nextDouble();
        System.out.print("informe a quantidade de horas: ");
        double qtdHoras = leitor.nextDouble();

        System.out.print("informe o percentual desconto inss: ");
        double inss = leitor.nextDouble();

        Salario salario = new Salario(valorHora, qtdHoras, inss);

        double soldo = salario.salarioLiquido(valorHora, qtdHoras, inss);

        System.out.printf("O salario do professor é R$: %.2f", soldo);
        System.out.println(" reais");

        leitor.close();
    }
}
