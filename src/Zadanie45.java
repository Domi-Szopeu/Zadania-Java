public class Zadanie45 {
//    Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10
//    o nazwie macierz umieszcza liczby 1 i 0 zgodnie z przedstawioną poniżej
//    interpretacją graficzną. Program dodatkowo powinien obliczać sumę wyróżnionych
//    elementów.
    public static void main(String[] args) {
        int n =10,x,y,z,suma = 0;
        int tab[][] = new int[n][n];
        for (x = 0; x < tab.length; x++) {
            for (y = 0; y < tab.length; y++){
                if (y == n - 1 - x){
                    tab[x][y] = 1;
                    suma = suma + tab[x][y];}
                else tab[x][y] = 0;
                System.out.print(tab[x][y] + " ");
            }
            System.out.println("");
        }
        System.out.println("Suma to: " + suma);
    }
}
