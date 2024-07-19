package exercicio24;

import java.util.Locale;
import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o tempo de viagem em MINUTOS: ");
        double tempo = leitor.nextDouble();
        System.out.print("Informe a velocidade média: ");
        double velocidade = leitor.nextDouble();

        double hora = tempo / 60;

        double distancia = hora * velocidade;

        double combustivel = distancia / 12;

        System.out.printf("A quantidade de litros de combustivel usada nessa viagem é %.2f ", combustivel);
        System.out.println(" litros");
        leitor.close();

    }
}
