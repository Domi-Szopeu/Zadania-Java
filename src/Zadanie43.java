public class Zadanie43 {
//    Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10
//    o nazwie macierz umieszcza na przekątnej liczbę 1, a poza przekątną — 0
//            (zobacz reprezentację graficzną tablicy na sąsiedniej stronie). Dodatkowo
//    program powinien obliczać sumę elementów wyróżnionych w tablicy,
//    tj. tych znajdujących się na jej przekątnej.
    public static void main(String[] args) {
        int n = 10,x,y, suma;
        suma = 0;
        int tab[][] = new int[n][n];
        for (x = 0; x < tab.length; x++) {
            for (y = 0; y < tab.length; y++) {
                if (x == y){
                    tab[x][y] = 1;
                    suma = suma + tab[x][y];
                }
                else tab[x][y] = 0;
                System.out.print(tab[x][y] + " ");
            }
            System.out.println("");
        }
    }
}
