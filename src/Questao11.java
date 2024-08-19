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

        System.out.print("Digite a primeira palavra: ");
        words[0] = scanner.nextLine().trim();

        System.out.print("Digite a segunda palavra: ");
        words[1] = scanner.nextLine().trim();

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
