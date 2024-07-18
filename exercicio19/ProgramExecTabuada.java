package exercicio19;

import java.util.Scanner;

public class ProgramExecTabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("MULTIPLICAÇÃO");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("SOMA");

        for (int item = 1; item <= 10; item++) {
            System.out.println("Tabuada do " + item + ":");
            for (int item2 = 1; item2 <= 10; item2++) {
                System.out.println(item + " + " + item2 + " = " + (item + item2));
            }
            System.out.println();
        }
        leitor.close();
    }

}
