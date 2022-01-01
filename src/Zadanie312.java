public class Zadanie312 {
//    Napisz program, który za pomocą instrukcji while sumuje liczby parzyste
//    od 1 do 100.
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        while (x <=100){
        x++;
        if (x % 2 == 0) {
            y = y + x;
        }}
        System.out.println("Suma to: " + y);
    }
}
