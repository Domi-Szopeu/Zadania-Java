public class Zadanie42 {
//    Napisz program, który w 10-elementowej tablicy jednowymiarowej o nazwie
//    dane umieszcza liczby od 9 do 0
    public static void main(String[] args) {
        int[] tab = new int [10];
        int x;
        for (x = 0; x < tab.length; x++){
            tab[x] = 9 - x;
            System.out.println("Tab[" + x + "] = " + tab[x]);
        }
    }
}
