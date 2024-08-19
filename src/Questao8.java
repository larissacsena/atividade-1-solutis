import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        String palavra = getWord();
        if (isPalindrome(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }

    private static String getWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        return scanner.nextLine().trim();
    }

    private static boolean isPalindrome(String palavra) {
        String normalizada = palavra.toLowerCase();
        int length = normalizada.length();

        for (int i = 0; i < length / 2; i++) {
            if (normalizada.charAt(i) != normalizada.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
