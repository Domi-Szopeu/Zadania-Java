import java.util.Random;
import java.util.Scanner;

public class Zadanie316 {
    private static int max,min;
    //    Napisz program, który za pomocą instrukcji for znajduje największą i najmniejszą
//    liczbę ze zbioru n wylosowanych liczb całkowitych od 0 do 99
//    (w zadaniu n = 5) oraz oblicza średnią ze wszystkich wylosowanych liczb.
    public static int funkcja(int suma,int l) {
        suma = suma + l;
        return suma;
    }

    public static void main(String[] args) {
        int x,n,l;
        int suma = 0;
        double y = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę powtórzeń");
        n = scanner.nextInt();
        max = 0;
        min = 99;
        for (x = 1; x <= n; x++) {
            Random r = new Random();
            l = r.nextInt(99);
            System.out.println("Licza to:" + l);
            suma = funkcja(suma,l);
                if (l > max){
                    max = l;
                }
                else if (l <= min) {
                    min = l;
                }
        }
        y = (double)suma / n;
        System.out.println("Srednia to:" + y );
        System.out.println( "Maksimum to:" + max);
        System.out.println( "Minimumto:" + min);
    }
}
