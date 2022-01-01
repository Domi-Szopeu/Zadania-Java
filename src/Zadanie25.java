import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Zadanie25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        try {
            double x;
            int liczba = random.nextInt(9);
            System.out.println("Odgadnij wartość liczby");
            x = scanner.nextDouble();
            while (x != liczba) {
                System.out.println("Spróbuj ponownie");
                x = scanner.nextDouble();
            }
        }
        catch (InputMismatchException exc) {
            System.out.println("Podana wartość nie jest liczbą");
        }
    }
}
