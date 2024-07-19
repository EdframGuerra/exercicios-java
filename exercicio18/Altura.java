package exercicio18;

import java.util.Locale;

public class Altura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int anos = 0;

        while (alturaFrancisco >= alturaSara) {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos++;

        }
        System.out.printf("Chico = %.2f", alturaFrancisco);
        System.out.print(" ,");
        System.out.printf("Sara = %.2f", alturaSara );
        System.err.println("anos = " + anos);
        System.out.println("Seria necessários " + anos + " anos para que Sara seja maior que Francisco.");

    }
}
