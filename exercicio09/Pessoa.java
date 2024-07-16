package exercicio09;

public class Pessoa {

    public double peso;
    public double altura;

    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

        public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double IMC(double peso, double altura) {
        return peso / (altura * altura);
    }    
}
