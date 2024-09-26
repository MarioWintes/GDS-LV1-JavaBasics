public class ArithmeticOperations {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Addition " + (a + b));
        System.out.println("Subtraktion " + (a - b));
        System.out.println("Multiplikation " + (a * b));
        System.out.println("Division " + (a / b));

        double divRest = (double) a /b;
        System.out.println("Division " + divRest);
        System.out.println("Modulo " + (a % b));
    }
}
