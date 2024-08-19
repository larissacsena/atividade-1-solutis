import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        int day = getDay();
        displayDayOfWeek(day);
    }

    private static int getDay() {
        Scanner scanner = new Scanner(System.in);
        int day = 0;

        while (true) {
            try {
                System.out.print("Digite um número de 1 a 7: ");
                day = Integer.parseInt(scanner.nextLine());
                if (day < 1 || day > 7) {
                    System.out.println("Número inválido. Por favor, insira um número entre 1 e 7.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        }

        return day;
    }

    private static void displayDayOfWeek(int day) {
        String[] daysInWeek = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};
        System.out.println("O dia correspondente é: " + daysInWeek[day - 1]);
    }
}
