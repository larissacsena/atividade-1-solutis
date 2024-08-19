public class Questao6 {

    public static void main(String[] args) {
        int intProduct = calculateIntProduct();
        float floatProduct = calculateFloatProduct();

        System.out.println("Produto (int) dos números ímpares de 15 a 30: " + intProduct);
        System.out.println("Produto (float) dos números ímpares de 15 a 30: " + floatProduct);
    }

    private static int calculateIntProduct() {
        int product = 1;
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }
        return product;
    }

    private static float calculateFloatProduct() {
        float product = 1.0f;
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }
        return product;
    }
}