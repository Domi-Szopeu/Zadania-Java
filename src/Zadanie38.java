public class Zadanie38 {
//    Napisz program, który korzystając z instrukcji do ... while, sumuje liczby
//    całkowite od 1 do 100.
    public static void main(String[] args) {
        int x = 1, y = 0;
        do {
            y = x + y;
            x++;
        }
        while (x <= 100);
        System.out.println("Suma to " + y);
    }
}
