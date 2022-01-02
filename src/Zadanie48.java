public class Zadanie48 {
//    Dane są dwie tablice dwuwymiarowe 10×10 o nazwach a i b. Tablica
//    a zawiera elementy przedstawione poniżej.
//        0 1 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9
//    Tablica b zawiera same zera. Napisz program, który przepisuje zawartość
//    tablicy a do tablicy b (interpretacja graficzna tablicy wynikowej na sąsiedniej
//            stronie), zamieniając kolumny na wiersze.
    public static void main(String[] args) {
        int n = 10,x,y,z=0;
        int tab1[][] = new int[n][n];
        int tab2[][] = new int[n][n];
        for (x = 0; x < tab1.length; x++) {
            for (y = 0; y < tab1.length; y++) {
                tab1[x][y] = z;
                z++;
                System.out.print(tab1[x][y] + " ");
            }
            z = 0;
            System.out.println("");
        } System.out.println("");
        for (x = 0; x < tab2.length; x++) {
            for (y = 0; y < tab2.length; y++) {
                tab2[x][y] = tab1[y][x];
                System.out.print(tab2[x][y] + " ");
            }
            System.out.println("");
        }
    }
}
