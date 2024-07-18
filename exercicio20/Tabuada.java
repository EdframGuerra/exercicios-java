package exercicio20;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Informe um numero: ");
        int numero = leitor.nextInt();

        for (int item : numeros) {
            int resultado = numero * item;
            System.out.println(numero + " * " + item + " = " + resultado);
        }

        leitor.close();
    }
}
