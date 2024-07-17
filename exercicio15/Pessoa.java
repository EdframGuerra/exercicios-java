package exercicio15;

public class Pessoa {

    public int anoNascimento;
    public int anoAtual;
    public int mesAtual;
    public int mesNascimento;
    public int diaAtual;
    public int diaNascimento;

    public Pessoa(int anoNascimento, int anoAtual, int mesAtual, int mesNascimento, int diaAtual, int diaNascimento) {
        this.anoNascimento = anoNascimento;
        this.anoAtual = anoAtual;
        this.mesAtual = mesAtual;
        this.mesNascimento = mesNascimento;
        this.diaAtual = diaAtual;
        this.diaNascimento = diaNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getMesAtual() {
        return mesAtual;
    }

    public void setMesAtual(int mesAtual) {
        this.mesAtual = mesAtual;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getDiaAtual() {
        return diaAtual;
    }

    public void setDiaAtual(int diaAtual) {
        this.diaAtual = diaAtual;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public void calcularIdade() {
        int diasVividos = 0;
        int mesesVividos = 0;
        int anosVividos = 0;

        int diasNoAno = 365;
        int diasNoMes = 30;

        int diasNoTotal = (anoAtual - anoNascimento) * diasNoAno + (mesAtual - mesNascimento) * diasNoMes
                + (diaAtual - diaNascimento);

        anosVividos = diasNoTotal / diasNoAno;
        diasNoTotal %= diasNoAno;

        mesesVividos = diasNoTotal / diasNoMes;
        diasNoTotal %= diasNoMes;

        diasVividos = diasNoTotal;

        System.out.println(anosVividos + " anos, " + mesesVividos + " meses e " + diasVividos + " dias.");
    }

}
