import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {
        String[] words = getWords();
        printWordsInAlphabeticalOrder(words);
        printWordWithMoreCharacters(words);
    }

    private static String[] getWords() {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[2];

        for (int i = 0; i < 2; i++) {
            boolean inputValido = false;
            while (!inputValido) {
                try {
                    System.out.print("Digite a " + (i + 1) + "ª palavra: ");
                    words[i] = scanner.nextLine().trim();
                    inputValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Erro de entrada! Por favor, tente novamente.");
                    scanner.nextLine();
                }
            }
        }

        return words;
    }

    private static void printWordsInAlphabeticalOrder(String[] words) {
        if (words[0].compareTo(words[1]) < 0) {
            System.out.println("Palavras em ordem alfabética:");
            System.out.println(words[0]);
            System.out.println(words[1]);
        } else {
            System.out.println("Palavras em ordem alfabética:");
            System.out.println(words[1]);
            System.out.println(words[0]);
        }
    }

    private static void printWordWithMoreCharacters(String[] words) {
        String biggestWord = words[0].length() >= words[1].length() ? words[0] : words[1];
        System.out.println("A palavra com o maior número de caracteres é: " + biggestWord);
    }
}
