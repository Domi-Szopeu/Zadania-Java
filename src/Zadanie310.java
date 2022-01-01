public class Zadanie310 {
//    Napisz program, który za pomocą instrukcji for sumuje liczby parzyste
//    od 1 do 100.
    public static void main(String[] args) {
        int x,y;
        y = 0;
        for (x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                y = y + x;
            }}
        System.out.println("Suma to: " + y);
    }
}
