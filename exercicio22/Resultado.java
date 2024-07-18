package exercicio22;

import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor1: ");
        int valor1 = leitor.nextInt();
        System.out.print("Digite o valor2: ");
        int valor2 = leitor.nextInt();

        if (valor2 > valor1) {
            System.out.println("O valor digitado não pode ser maior que o valor digitado anteriormente");
        }

        int resto = valor1 % valor2;

        if (resto == 0) {
            int quociente = valor1 / valor2;
            System.out.println("quociente = " + quociente + ", resto = " + resto);
        }
        else{
            int quociente = valor1 / valor2; 
            System.out.println("quociente = " + quociente + ", resto = " + resto);
        }

        leitor.close();
    }
}
