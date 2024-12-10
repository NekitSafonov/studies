import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        double fx;
        if (x < 8) {
            fx = Math.abs(a * x + b);
        } else if (x == 8) {
            fx = 5 * Math.sqrt(b * x + 3);
        } else if (x > 8 && x <= 10) {
            fx = Math.cos(x);
        } else {
            System.out.println("Значення x виходить за допустимі межі!");
            return;
        }
        System.out.println("f(x) = " + fx);
    }
}