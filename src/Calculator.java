import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 0;
        int addition, subtraction, multiplication, division, rest = 0;
        String calcName = "MaschineBalthasar";

        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        addition = add(number1, number2);
        System.out.println("addition = " + addition);

        subtraction = subtract(number1, number2);
        System.out.println("subtraction = " + subtraction);

        multiplication = multiply(number1, number2);
        System.out.println("multiplication = " + multiplication);

        division = divide(number1, number2);
        System.out.println("division = " + division);

        rest = modulate(number1, number2);
        System.out.println("modulo = " + rest);


    }
    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static int modulate(int a, int b){
        return a % b;
    }
}
