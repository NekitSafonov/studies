import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Примітивні типи даних в Java:");

        System.out.println("Тип: byte");
        System.out.println("Розмір: " + Byte.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("Максимальне значення: " + Byte.MAX_VALUE);
        System.out.println();

        System.out.println("Тип: short");
        System.out.println("Розмір: " + Short.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("Максимальне значення: " + Short.MAX_VALUE);
        System.out.println();

        System.out.println("Тип: int");
        System.out.println("Розмір: " + Integer.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("Тип: long");
        System.out.println("Розмір: " + Long.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("Максимальне значення: " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("Тип: float");
        System.out.println("Розмір: " + Float.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Float.MIN_VALUE);
        System.out.println("Максимальне значення: " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("Тип: double");
        System.out.println("Розмір: " + Double.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Double.MIN_VALUE);
        System.out.println("Максимальне значення: " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("Тип: boolean");
        System.out.println("Розмір: немає (залежить від JVM)");
        System.out.println("Можливі значення: true, false");
        System.out.println();

        System.out.println("Тип: char");
        System.out.println("Розмір: " + Character.SIZE + " біт");
        System.out.println("Мінімальне значення: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальне значення: " + (int) Character.MAX_VALUE);
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть ціле число (int): ");
            String intInput = scanner.nextLine();
            int intValue = Integer.parseInt(intInput);
            System.out.println("Введене ціле число: " + intValue);

            System.out.print("Введіть число з плаваючою точкою (double): ");
            String doubleInput = scanner.nextLine();
            double doubleValue = Double.parseDouble(doubleInput);
            System.out.println("Введене число з плаваючою точкою: " + doubleValue);

            System.out.print("Введіть булеве значення (true/false): ");
            String booleanInput = scanner.nextLine();
            boolean booleanValue = Boolean.parseBoolean(booleanInput);
            System.out.println("Введене булеве значення: " + booleanValue);

            System.out.print("Введіть символ (char): ");
            String charInput = scanner.nextLine();
            char charValue = charInput.charAt(0);  
            System.out.println("Введений символ: " + charValue);

        } catch (NumberFormatException e) {
            System.out.println("Помилка: введено некоректне значення для типу даних.");
        }

        scanner.close();
    }
}