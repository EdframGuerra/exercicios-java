package exercicio18;

import java.util.Scanner;

public class ProgramExecTabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int numero = leitor.nextInt();

        System.out.println("Tabuada das 04 operações do numeral " + numero + " :");
        System.out.println();
        System.out.println("MULTIPLICAÇÃO");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;

            System.out.println(numero + " X " + i + " = " + resultado);
        }

        System.out.println();
        System.out.println("SOMA");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero + i;

            System.out.println(numero + " + " + i + " = " + resultado);
        }

        // System.out.println();
        // System.out.println("Divisão");
        // for (int i = 1; i <= 10; i++) {
        //     int resultado = numero / i;

        //     System.out.println(numero + " / " + i + " = " + resultado);
        // }

        // System.out.println();
        // System.out.println("SUBTRAÇÃO");
        // for (int i = 1; i <= 10; i++) {
        //     int resultado = numero - i;

        //     System.out.println(numero + " - " + i + " = " + resultado);
        // }

        leitor.close();
    }
}
