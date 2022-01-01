public class Zadanie41 {
//    Napisz program, który w 10-elementowej tablicy jednowymiarowej o nazwie
//    dane umieszcza liczby od 0 do 9
    public static void main(String[] args) {
        int[] tab = new int[10];
        int x;
        for (x = 0; x < tab.length; x++){
            tab[x] = x;
            System.out.println("Tab[" + x + "] = " + tab[x]);
        }
    }
}
