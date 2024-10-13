import java.util.Scanner;
// 3 Variant
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть першу дату (день, місяць, рік): ");
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int year1 = scanner.nextInt();
        
        System.out.println("Введіть другу дату (день, місяць, рік): ");
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();
        
        if (year1 < year2) {
            System.out.println("Перша дата раніша за другу.");
        } else if (year1 > year2) {
            System.out.println("Друга дата раніша за першу.");
        } else {
            if (month1 < month2) {
                System.out.println("Перша дата раніша за другу.");
            } else if (month1 > month2) {
                System.out.println("Друга дата раніша за першу.");
            } else {
                if (day1 < day2) {
                    System.out.println("Перша дата раніша за другу.");
                } else if (day1 > day2) {
                    System.out.println("Друга дата раніша за першу.");
                } else {
                    System.out.println("Дати однакові.");
                }
            }
        }

        scanner.close();

    } 
}    