import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        double miles = getMiles();
        convertAndDisplayKilometers(miles);
    }

    private static double getMiles() {
        Scanner scanner = new Scanner(System.in);
        double miles = 0;

        while (true) {
            try {
                System.out.print("Digite a distância em milhas: ");
                miles = Double.parseDouble(scanner.nextLine());
                if (miles < 0) {
                    System.out.println("Por favor, insira um valor positivo.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
            }
        }

        return miles;
    }

    private static void convertAndDisplayKilometers(double miles) {
        double kilometers = miles * 1.609;
        System.out.printf("A distância em quilômetros é: %.3f km%n", kilometers);
    }
}
