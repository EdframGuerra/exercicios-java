package exercicio09;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec009 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = leitor.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = leitor.nextDouble();

        Pessoa pessoa = new Pessoa(peso, altura);

        double imc = pessoa.IMC(peso, altura);
        System.out.printf("%.1f", imc);
        System.out.println();

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }

        else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal (PARABÉNS)");
        }

        else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        }

        else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        }

        else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Peso ideal (Obesidade grau II(SEVERA)");
        }

        else {
            System.out.println("Peso ideal (Obesidade grau III(MÓRBIDA)");
        }

        leitor.close();

    }
}
