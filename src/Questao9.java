import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        double radius = getRadius();
        double area = calculateArea(radius);
        System.out.printf("A área do círculo com raio %.2f é: %.2f%n", radius, area);
    }

    private static double getRadius() {
        Scanner scanner = new Scanner(System.in);
        double radius = 0;

        while (true) {
            try {
                System.out.print("Digite o raio do círculo: ");
                radius = Double.parseDouble(scanner.nextLine());
                if (radius < 0) {
                    System.out.println("O raio deve ser um número positivo. Tente novamente.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        }

        return radius;
    }

    private static double calculateArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area * 100.0) / 100.0;
    }
}
