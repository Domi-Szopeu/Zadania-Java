public class Zadanie412 {
//    Posortuj rosnąco następujące 6 liczb: 574, 303, 34, 125, 8 oraz 23, stosując
//    algorytm sortowania bąbelkowego.
    public static void main(String[] args) {
        int i,j,z;
        int[] t = {574, 303, 34, 125, 8, 23};
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                if (t[j - 1] > t[j]) {
                    z = t[j - 1];
                    t[j - 1] = t[j];
                    t[j] = z;
                }
            }
        }
        for (i = 0; i <= 5; i++) {
            System.out.println(t[i]);
        }
    }
}