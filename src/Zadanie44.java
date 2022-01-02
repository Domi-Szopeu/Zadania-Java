public class Zadanie44 {
//    Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10
//    o nazwie macierz umieszcza na przekątnej liczby od 0 do 9, a poza przekątną
//    liczbę 0. Dodatkowo program powinien obliczać sumę elementów wyróżnionych
//    w tablicy (znajdujących się na przekątnej).
    public static void main(String[] args) {
        int n = 10,x,y,z, suma;
        z = 0;
        suma = 0;
        int tab[][] = new int[n][n];
        for (x = 0; x < tab.length; x++) {
            for (y = 0; y < tab.length; y++) {
                if (x == y) {
                    tab[x][y] = z;
                    suma = suma + z;
                    z++;
                }
                else tab[x][y] = 0;
                System.out.print(tab[x][y] + " ");
            }
            System.out.println("");
        }
        System.out.println("Suma to: " + suma);
    }
}
