public class Main {
    public static void main(String[] args) {

        double a = -0.92;
        double b = 0.58;


        double x = Math.abs(Math.cos(a)) + Math.cos(Math.pow(b, -2 * Math.sin(b)));

        double y = Math.log(Math.pow(b, 1 / Math.abs(a))) * ((a - b) / 2);
        System.out.println("Результати обчислень:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}