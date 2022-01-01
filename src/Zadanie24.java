import java.util.Scanner;

public class Zadanie24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, a, b, c;

        System.out.println("Wprowadź wartośc a");
        a = scanner.nextDouble();
        while (a == 0) {
            System.out.println("Równanie nie może zostać rozwiązane, podaj inną wartość wyrażenia a");
            a = scanner.nextDouble();
        }
        System.out.println("Wprowadź wartośc b");
        b = scanner.nextDouble();
        System.out.println("Wprowadź wartosc c");
        c = scanner.nextDouble();
        x = (c - b) / a;
        System.out.println("x wynosi:" + x);
    }
}
