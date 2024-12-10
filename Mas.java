import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.println("Завдання 1: Введіть розмір масиву:");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < size1; i++) {
            array1[i] = random.nextInt(100) + 1; 
            if (array1[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Згенерований масив: " + Arrays.toString(array1));
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        
       
        System.out.println("\nЗавдання 2: Введіть кількість кутів багатокутника:");
        int n = scanner.nextInt();
        int[] angles = new int[n];
        int sumOfAngles = 0;

        System.out.println("Введіть значення кутів багатокутника:");
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sumOfAngles += angles[i];
        }

        int requiredSum = 180 * (n - 2);
        if (sumOfAngles == requiredSum) {
            System.out.println("Багатокутник із кутами " + Arrays.toString(angles) + " може існувати.");
        } else {
            System.out.println("Багатокутник із кутами " + Arrays.toString(angles) + " НЕ може існувати.");
        }

       
        
        System.out.println("\nЗавдання 3: Введіть розмір масиву:");
        int size3 = scanner.nextInt();
        int[] array3 = new int[size3];

        System.out.println("Згенерований масив:");
        for (int i = 0; i < size3; i++) {
            array3[i] = random.nextInt(100) + 1;
            System.out.print(array3[i] + " ");
        }

        System.out.println("\nВведіть значення для пошуку:");
        int searchValue = scanner.nextInt();
        System.out.println("Введіть нове значення:");
        int newValue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size3; i++) {
            if (array3[i] == searchValue) {
                array3[i] = newValue;
                found = true;
            }
        }

        if (found) {
            System.out.println("Оновлений масив: " + Arrays.toString(array3));
        } else {
            System.out.println("Значення " + searchValue + " не знайдено у масиві.");
        }

        

        
        System.out.println("\nЗавдання 4: Таблиця синусів для значень від 0 до 90 градусів");
        for (int i = 0; i <= 90; i++) {
            System.out.printf("sin(%d) = %.4f\t", i, Math.sin(Math.toRadians(i)));
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
        }
        
        System.out.println("\n\nЗавдання 5: Введіть розмір масиву:");
        int size5 = scanner.nextInt();
        int[] array5 = new int[size5];

        System.out.println("Згенерований масив:");
        for (int i = 0; i < size5; i++) {
            array5[i] = random.nextInt(100) + 1;
            System.out.print(array5[i] + " ");
        }

        System.out.println("\nПеревірити, чи є масив зростаючим (1) або спадним (2):");
        int choice = scanner.nextInt();
        boolean isSorted = true;

        if (choice == 1) {
            for (int i = 1; i < size5; i++) {
                if (array5[i] < array5[i - 1]) {
                    isSorted = false;
                    break;
                }
            }
        } else if (choice == 2) {
            for (int i = 1; i < size5; i++) {
                if (array5[i] > array5[i - 1]) {
                    isSorted = false;
                    break;
                }
            }
        }

        if (isSorted) {
            System.out.println("Масив є " + (choice == 1 ? "зростаючим" : "спадним") + ".");
        } else {
            System.out.println("Масив не є " + (choice == 1 ? "зростаючим" : "спадним") + ".");
        }

        scanner.close();
    }
}