import java.util.Scanner;

public class PoleProstokata {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double a;
            double b;
            System.out.println("Podaj długość boku a");
            a = scanner.nextDouble();
            System.out.println("Podaj długość boku b");
            b = scanner.nextDouble();
            System.out.println(a * b + "cm2" );
        }


}
