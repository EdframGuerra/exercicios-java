package exercicio12;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPagProduto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double valor = leitor.nextDouble();
        System.out.println();
        System.out.println("FORMAS DE PAGAMENTO: ");
        System.out.println("À Vista em Dinheiro ou Pix, 15% de desconto, DIGITE: 1");
        System.out.println("À Vista no cartão de crédito, recebe 10% de desconto, DIGITE: 2");
        System.out.println("Parcelado no cartão em duas vezes, preço normal do produto sem juros, DIGITE: 3");
        System.out.println("Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%, DIGITE: 4");

        System.out.println("Digite o código de pagamento: ");
        int codigoPagamento = leitor.nextInt();

        Produto pagamento = new Produto(valor, codigoPagamento);

        double valorPagamento = pagamento.valorPagamento(valor,codigoPagamento);

        System.out.printf("O valor a pagar é %.2f: ", valorPagamento);

        leitor.close();
    }
}
