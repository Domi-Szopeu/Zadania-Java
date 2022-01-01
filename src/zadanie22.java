import java.util.Scanner;
public class zadanie22 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double delta;
        double d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wartośc a");
        a = scanner.nextDouble();
        System.out.println("Wprowadź wartośc b");
        b = scanner.nextDouble();
        System.out.println("Wprowadź wartosc c");
        c = scanner.nextDouble();
        System.out.println("Dla równania a*x^2 + bx + c = 0");
        delta = Math.pow(b,2) - 4 * a * c;
        System.out.println("Delta wynosi:" + delta);
        if (delta < 0) {
            System.out.println("Brak miejsc zerowych");
        }
        else {
            d = Math.sqrt(delta);
            x1 = (-b + d)/(2 * a);
            x2 = (-b - d)/(2 * a);
            System.out.println( "Pierwiastki to:" + x1 + "," + x2);
        }
    }
}
