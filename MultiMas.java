import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Завдання 1: Зубчастий пірамідальний масив");
        int[][] pyramid = new int[5][];
        for (int i = 0; i < 5; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = random.nextInt(100) + 1;
            }
        }

        System.out.println("Звичайний порядок:");
        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Зворотний порядок:");
        for (int i = pyramid.length - 1; i >= 0; i--) {
            for (int j = pyramid[i].length - 1; j >= 0; j--) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nЗавдання 2: Двовимірний масив з непарними індексами");
        double[][] array = new double[4][4];
        System.out.println("Оригінальний масив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextDouble() * 100;
                System.out.printf("%.2f ", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nОброблений масив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 != 0 || j % 2 != 0) {
                    array[i][j] = Math.sqrt(array[i][j]);
                }
                System.out.printf("%.2f ", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nЗавдання 3: Визначник матриці 5x5");
        int[][] matrix = new int[5][5];
        System.out.println("Введіть елементи матриці 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Обчислення визначника:");
        int determinant = calculateDeterminant(matrix, 5);
        System.out.println("Визначник = " + determinant);

        System.out.println("\nЗавдання 4: Мінор матриці");
        System.out.println("Введіть розмір матриці:");
        int n = scanner.nextInt();
        int[][] userMatrix = new int[n][n];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                userMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Введіть рядок для мінору:");
        int row = scanner.nextInt();
        System.out.println("Введіть стовпець для мінору:");
        int col = scanner.nextInt();

        int[][] minor = getMinor(userMatrix, row, col);
        System.out.println("Матриця мінору:");
        for (int[] ints : minor) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("\nЗавдання 5: Транспонована матриця");
        System.out.println("Введіть розмірність квадратної матриці:");
        int dim = scanner.nextInt();
        int[][] squareMatrix = new int[dim][dim];
        System.out.println("Заповніть матрицю:");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                squareMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Транспонована матриця:");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(squareMatrix[j][i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static int calculateDeterminant(int[][] matrix, int n) {
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        int determinant = 0;
        for (int k = 0; k < n; k++) {
            int[][] minor = getMinor(matrix, 0, k);
            determinant += Math.pow(-1, k) * matrix[0][k] * calculateDeterminant(minor, n - 1);
        }
        return determinant;
    }

    private static int[][] getMinor(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int[][] minor = new int[n - 1][n - 1];
        int minorRow = 0, minorCol;
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            minorCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                minor[minorRow][minorCol++] = matrix[i][j];
            }
            minorRow++;
        }
        return minor;
    }
}