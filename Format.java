import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int integerInput = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double DoubleInput = scanner.nextDouble();

        System.out.print("Введіть строку: ");
        scanner.nextLine();
        String stringInput = scanner.nextLine();

        System.out.print("Введіть логічне значення (true або false): ");
        boolean boolInput = scanner.nextBoolean();
        System.out.printf("Ціле число: %d%n", integerInput);
        System.out.printf("Число з плаваючою точкою: %.2f%n", DoubleInput);
        System.out.printf("Строка: %s%n", stringInput);
        System.out.printf("Логічне значення: %b%n", boolInput);
        System.out.println(String.format("Ціле число: %d", integerInput));
        System.out.println(String.format("Число з плаваючою точкою: %.2f", DoubleInput));
        System.out.println(String.format("Строка: %s", stringInput));
        System.out.println(String.format("Логічне значення: %b", boolInput));
        System.out.println("Ціле число: " + integerInput);
        System.out.println("Число з плаваючою точкою: " + DoubleInput);
        System.out.println("Строка: " + stringInput);
        System.out.println("Логічне значення: " + boolInput);

    }
}