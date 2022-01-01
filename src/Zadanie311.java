public class Zadanie311 {
//    Napisz program, który za pomocą instrukcji do ... while sumuje liczby
//    parzyste od 1 do 100.
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        do {
            x++;
            if (x % 2 == 0){
            y = y + x;
            }}
        while (x <= 100);
        System.out.println("Suma to: " + y);
    }
}
