class Questao2 {
    public static void main(String[] args) {

        float biggestNumber = getBiggestNumber(12, 6);

        System.out.println(biggestNumber);
    }

    public static float getBiggestNumber(float firstNumber, float secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }

}