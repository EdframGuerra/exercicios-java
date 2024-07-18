package exercicio23;

public class Salario {

    public double valorHora;
    public double numeroHoras;
    public double desconto;

    public Salario(double valorHora, double numeroHoras, double desconto) {
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
        this.desconto = desconto;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(double numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double salarioLiquido(double valorHora, double numeroHoras, double desconto) {
        double sal = (valorHora * numeroHoras);
        double inss = sal * desconto/100;
        double soldo = sal - inss;
        return soldo;
    }
}