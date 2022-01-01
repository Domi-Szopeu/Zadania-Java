import java.util.Scanner;

public class zadanie21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double a2;
        double b2;
        double c2;
        System.out.println("Wprowadź długość boku a");
        a = scanner.nextDouble();
        System.out.println("Wprowadź długośc boku b");
        b = scanner.nextDouble();
        System.out.println("Wprowadź długość boku c");
        c = scanner.nextDouble();
        while (a > 0 && b > 0 && c > 0) {
            a2 = Math.pow(a,2);
            b2 = Math.pow(b,2);
            c2 = Math.pow(c,2);
            if (a2 + b2 == c2) {
                System.out.println("Trójkąt jest prostokątny");
                break;
            }
            else {
                System.out.println("Trójkąt nie jest prostokątny");
            }
        }

    }
}