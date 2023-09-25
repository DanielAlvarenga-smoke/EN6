package meiadois;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculadoraIdade {

    public static int calcularIdade(LocalDate dataNascimento, LocalDate dataAtual) {
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data de nascimento no formato AAAA-MM-DD:");
        String dataNascimentoStr = scanner.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

        LocalDate dataAtual = LocalDate.now();

        int idade = calcularIdade(dataNascimento, dataAtual);
        System.out.println("Sua idade atual é: " + idade + " anos");

        scanner.close();
    }
}