public class Zadanie47 {
//    Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10
//    umieszcza w pierwszej kolumnie liczby od 0 do 9, w drugiej kwadraty tych
//    liczb, natomiast w pozostałych kolumnach 0 (interpretacja graficzna tablicy
//    poniżej). Dodatkowo program powinien obliczać osobno sumę liczb znajdujących
//    się w pierwszej oraz w drugiej kolumnie.
    public static void main(String[] args) {
        int n = 10, x,y;
        double z = 0,suma1 = 0, suma2 = 0;
        double tab[][] = new double[n][n];
        for (x = 0; x < tab.length; x++) {
            for (y = 0; y < tab.length; y++) {
                    if (y == 0) {
                        tab[x][y] = z;
                        suma1 = suma1 + tab[x][y];
                    } else if (y == 1) {
                        tab[x][y] = z * z;
                        suma2 = suma2 + tab[x][y];
                    } else tab[x][y] = 0;
                    System.out.print(tab[x][y] + " ");
            }
            z++;
            System.out.println("");

        }
        System.out.println("Suma liczb w pierwszej kolumnie to: " + suma1);
        System.out.println("Suma liczb w drugiej kolumnie to: " + suma2);
    }
}