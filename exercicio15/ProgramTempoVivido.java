package exercicio15;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class ProgramTempoVivido {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe sua data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = leitor.nextLine();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Date dataDeNascimento = dataFormatada.parse(dataNascimento);

        LocalDate dataDeNascimentoLocal = dataDeNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int anoNascimento = dataDeNascimentoLocal.getYear();
        int mesNascimento = dataDeNascimentoLocal.getMonthValue();
        int diaNascimento = dataDeNascimentoLocal.getDayOfMonth();

        LocalDate dataAtual = LocalDate.now();

        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();

        Pessoa usuario = new Pessoa(anoNascimento, anoAtual, mesAtual, mesNascimento, diaAtual, diaNascimento);

        usuario.calcularIdade();

        leitor.close();
    }
}
