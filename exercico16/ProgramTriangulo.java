package exercico16;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a medida do lado A: ");
        double ladoA = leitor.nextDouble();
        System.out.print("Informe a medida do lado B: ");
        double ladoB = leitor.nextDouble();
        System.out.print("Informe a medida do lado C: ");
        double ladoC = leitor.nextDouble();

        Triangulo clasificacao = new Triangulo(ladoA, ladoB, ladoC);

        String triangulo = clasificacao.tipoTriangulo(ladoA, ladoB, ladoC);

        if (triangulo == "Equilátero") {
            System.out.println(triangulo);
            System.out.println("Triangulo equilátero");
        } else if (triangulo == "Isósceles") {
            System.out.println(triangulo);
            System.out.println("Triangulo isósceles");
        } else {
            System.out.println(triangulo);
            System.out.println("Triangulo escaleno");
        }

        leitor.close();
    }
}
