import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        List<Integer> mileages = new ArrayList<>();
        List<Integer> liters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados para cada tanque cheio:");

        while (true) {
            int km = getIntInput("Digite a quilometragem dirigida (ou um número negativo para encerrar): ", scanner);
            if (km <= 0) break;

            int ltr = getIntInput("Digite a quantidade de combustível consumida em litros: ", scanner);
            if (ltr < 0) {
                System.out.println("A quantidade de combustível deve ser um número não negativo.");
                continue;
            }

            mileages.add(km);
            liters.add(ltr);

            double consumption = calculateConsumption(km, ltr);
            System.out.printf("Consumo para o tanque atual: %.2f km/l%n", consumption);
        }

        double totalMileage = calculateTotalMileage(mileages);
        int totalLiters = calculateTotalLiters(liters);
        double averageConsumption = totalMileage / totalLiters;

        System.out.println("\n----------RELATÓRIO FINAL--------");
        System.out.printf("Quilometragem combinada: %.2f km%n", totalMileage);
        System.out.printf("Soma total de litros de combustível: %d litros%n", totalLiters);
        System.out.printf("Consumo médio: %.2f km/l%n", averageConsumption);
        System.out.println("-----------------------------------");
    }

    private static int getIntInput(String prompt, Scanner scanner) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }
    }

    private static double calculateConsumption(int km, int liters) {
        return (double) km / liters;
    }

    private static double calculateTotalMileage(List<Integer> mileages) {
        return mileages.stream().mapToDouble(Integer::doubleValue).sum();
    }

    private static int calculateTotalLiters(List<Integer> liters) {
        return liters.stream().mapToInt(Integer::intValue).sum();
    }
}
