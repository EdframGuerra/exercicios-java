package exercicio11;

public class Aluno {

    public String nome;
    public double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Aluno(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double media(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
