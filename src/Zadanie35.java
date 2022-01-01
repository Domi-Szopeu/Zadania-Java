public class Zadanie35 {
//    Napisz program, który za pomocą instrukcji do ... while wyświetla liczby
//    całkowite od 1 do 20.
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println("x=" + x + '\t');
            x++;
        }
        while (x <= 20);
    }
}
