package meiatres;
import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarando arrays para armazenar os dados
        String[] nomes = new String[7];
        int[] idades = new int[7];
        double[] alturas = new double[7];

        // Cadastrar dados das pessoas
        for (int i = 0; i < 7; i++) {
            System.out.println("Informe o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.println("Informe a idade da pessoa " + (i + 1) + ": ");
            idades[i] = Integer.parseInt(scanner.nextLine());

            System.out.println("Informe a altura (em metros) da pessoa " + (i + 1) + ": ");
            alturas[i] = Double.parseDouble(scanner.nextLine());
        }

        // Exibir os dados cadastrados na ordem informada
        System.out.println("\nDados cadastrados:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println("Altura: " + alturas[i] + " metros\n");
        }

        // Calcular a média das idades
        double mediaIdades = calcularMediaIdades(idades);

        // Calcular a altura média
        double alturaMedia = calcularAlturaMedia(alturas);

        // Exibir a média das idades e a altura média
        System.out.println("Média das Idades: " + mediaIdades);
        System.out.println("Altura Média: " + alturaMedia + " metros");

        scanner.close();
    }

    public static double calcularMediaIdades(int[] idades) {
        int somaIdades = 0;
        for (int idade : idades) {
            somaIdades += idade;
        }
        return (double) somaIdades / idades.length;
    }

    public static double calcularAlturaMedia(double[] alturas) {
        double somaAlturas = 0;
        for (double altura : alturas) {
            somaAlturas += altura;
        }
        return somaAlturas / alturas.length;
    }
}
