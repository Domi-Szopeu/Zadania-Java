import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj rodzaj działania");
        System.out.println("1 - dodawanie, 2 - odejmowanie, 3 - dzielenie, 4 - mnożenie");
        try {
            double a;
            double b;
            int znak;
            znak = scanner.nextInt();
            while (znak > 0){
                if(znak < 5) {
                    System.out.println("Podaj pierwszą liczbę");
                    a = scanner.nextDouble();
                    System.out.println("Podaj kolejną liczbę");
                    b = scanner.nextDouble();
                    if (znak == 1) {
                        System.out.println("Wynik to:");
                        System.out.println(a + b);
                    } else if (znak == 2) {
                        System.out.println("Wynik to:");
                        System.out.println(a - b);
                    } else if (znak == 3) {
                        System.out.println("Wynik to:");
                        System.out.println(a * b);
                    } else if (znak == 4) {
                        System.out.println("Wynik to:");
                        System.out.println(a / b);
                    }
                }
                System.out.println("Podaj rodzaj działania");
                System.out.println("1 - dodawanie, 2 - odejmowanie, 3 - dzielenie, 4 - mnożenie");
                znak = scanner.nextInt();

            }
        }
        catch (InputMismatchException exc){
            System.out.println("Podana wartość nie jest liczbą");
        }
    }
}

