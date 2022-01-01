import java.util.Scanner;

public class Zasanie23 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double delta;
        double d;
        int liczba_pierwiastkow;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wartośc a");
        a = scanner.nextDouble();
        System.out.println("Wprowadź wartośc b");
        b = scanner.nextDouble();
        System.out.println("Wprowadź wartosc c");
        c = scanner.nextDouble();
        System.out.println("Dla równania a*x^2 + bx + c = 0");
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            liczba_pierwiastkow = 0;
        } else if (delta == 0) {
            liczba_pierwiastkow = 1;
        } else {
            liczba_pierwiastkow = 2;
        }
        switch (liczba_pierwiastkow) {
            case 0 -> System.out.println("Brak miejsc zerowych");
            case 1 -> {
                x1 = (-b) / (2 * a);
                System.out.println("Pierwiastek podwójny to:" + x1);
            }
            case 2 -> {
                d = Math.sqrt(delta);
                x1 = (-b + d) / (2 * a);
                x2 = (-b - d) / (2 * a);
                System.out.println("Pierwiastki to:" + x1 + "," + x2);
            }
        }
    }
}
