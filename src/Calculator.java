import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 0;
        int result = 0;
        String calcName = "MaschineBalthasar";

        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        result = number1 + number2;

        System.out.println("Mein Name ist " + calcName + " " + result);


    }
}
