import java.util.Scanner;

public class Questao10 {

    private static final String VOWELS = "aeiou";

    public static void main(String[] args) {
        String texto = getText();
        int[] contagem = countVowelsSpacesConsonants(texto);

        System.out.println("Quantidade de vogais: " + contagem[0]);
        System.out.println("Quantidade de espaços em branco: " + contagem[1]);
        System.out.println("Quantidade de consoantes: " + contagem[2]);
    }

    private static String getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto a ser analisado: ");
        return scanner.nextLine();
    }

    private static int[] countVowelsSpacesConsonants(String texto) {
        int vowels = 0, spaces = 0, consonants = 0;
        String textoLower = texto.toLowerCase();

        for (char c : textoLower.toCharArray()) {
            if (Character.isWhitespace(c)) {
                spaces++;
            } else if (isVowel(c)) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        return new int[]{vowels, spaces, consonants};
    }

    private static boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
    }
}
