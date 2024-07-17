package exercicio12;

public class Produto {

    public double valor;
    public int codigoPagamento;

    public Produto(double valor, int codigoPagamento) {
        this.valor = valor;
        this.codigoPagamento = codigoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigoPagamento() {
        return codigoPagamento;
    }

    public void setCodigoPagamento(int codigoPagamento) {
        this.codigoPagamento = codigoPagamento;
    }

    public double valorPagamento(double valor, int codigoPagamento) {
        double desconto;
        double juros;
        if (codigoPagamento == 1) {
            desconto = 15.0 / 100;
            valor = valor - (valor * desconto);
            return valor;
        } else if (codigoPagamento == 2) {
            desconto = 10.0 / 100;
            valor = valor - (valor * desconto);
            return valor;
        } else if (codigoPagamento == 3) {
            return valor;
        } else if (codigoPagamento == 4) {
            juros = 10.0 / 100;
            valor = valor + (valor * juros);
            return valor;
        } else {
            throw new IllegalArgumentException("Informe o código correto.");
        }        
    }
}