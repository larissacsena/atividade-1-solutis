public class Questao7 {

    public static void main(String[] args) {
        System.out.println("Divisão por 2 dos múltiplos de 3 (int):");
        printIntDivisionResults();

        System.out.println("\nDivisão por 2 dos múltiplos de 3 (double):");
        printDoubleDivisionResults();
    }

    private static void printIntDivisionResults() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int result = i / 2;
                System.out.println(i + " / 2 = " + result);
            }
        }
    }

    private static void printDoubleDivisionResults() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double result = i / 2.0;
                System.out.println(i + " / 2 = " + result);
            }
        }
    }
}
