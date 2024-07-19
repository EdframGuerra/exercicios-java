package exercicio21;

import java.util.Random;

public class Numeros {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println("Numero: " + randomNumber);
    }
}
