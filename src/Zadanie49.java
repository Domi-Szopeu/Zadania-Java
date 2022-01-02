public class Zadanie49 {
    //    Dane są dwie macierze 10×10 o nazwach a i b. Macierz a zawiera elementy
//        przedstawione poniżej.
//        1 1 1 1 1 1 1 1 1 1
//        1 1 1 1 1 1 1 1 1 1
//        1 1 1 1 1 1 1 1 1 1
//        1 1 1 1 1 1 1 1 1 1
//        1 1 1 1 1 1 1 1 1 1
//        1 1 1 1 1 1 1 1 1 1
//        1 1 1 1 1 1 1 1 1 1
//        1 1 1 1 1 1 1 1 1 1
//        1 1 1 1 1 1 1 1 1 1
//        1 1 1 1 1 1 1 1 1 1
//        Macierz b ma postać
//        2 2 2 2 2 2 2 2 2 2
//        2 2 2 2 2 2 2 2 2 2
//        2 2 2 2 2 2 2 2 2 2
//        2 2 2 2 2 2 2 2 2 2
//        2 2 2 2 2 2 2 2 2 2
//        2 2 2 2 2 2 2 2 2 2
//        2 2 2 2 2 2 2 2 2 2
//        2 2 2 2 2 2 2 2 2 2
//        2 2 2 2 2 2 2 2 2 2
//        2 2 2 2 2 2 2 2 2 2
//        Napisz program, który dodaje obie macierze i wyświetla na ekranie komputera
//        wynik dodawania c = a+b.
    public static void main(String[] args) {
        int n = 10, x, y, z;
        int[][] tab1 = new int[n][n];
        int[][] tab2 = new int[n][n];
        int[][] tab3 = new int[n][n];
        for (x = 0; x < tab1.length; x++) {
            for (y = 0; y < tab1.length; y++) {
                tab1[x][y] = 1;
                System.out.print(tab1[x][y] + " ");
            }
            System.out.println("");
        } System.out.println("");
        for (x = 0; x < tab2.length; x++) {
            for (y = 0; y < tab2.length; y++) {
                tab2[x][y] = 2;
                System.out.print(tab2[x][y] + " ");
            }
            System.out.println("");
        } System.out.println("");
        for (x = 0; x < tab3.length; x++) {
            for (y = 0; y < tab3.length; y++) {
                tab3[x][y] = tab1[x][y] + tab2[x][y];
                System.out.print(tab3[x][y] + " ");
            }
            System.out.println("");
        }
    }
}