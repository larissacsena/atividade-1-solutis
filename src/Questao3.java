import java.util.InputMismatchException;
import java.util.Scanner;

class Questao3 {
    public static void main(String[] args) {

        int number = getValidInteger();

        showAllPrimeNumbers(number);
    }

    public static int getValidInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("\nDigite um número inteiro: ");
            try {
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }
        return number;
    }

    public static void showAllPrimeNumbers(int number) {
        System.out.println("Lista de todos números primos menores que " + number + ": ");
        for (int i = 0; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
