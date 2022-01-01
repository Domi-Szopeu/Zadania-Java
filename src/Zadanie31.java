public class Zadanie31 {

// Zadanie32
//Napisz program, który za pomocą instrukcji do ... while dla danych wartości
//    x zmieniających się od 0 do 10 oblicza wartość funkcji y = 3x.

    public static void main(String[] args) {
        int x,y;
        System.out.println("Dla y=3*x");
        x = 0;
        do {
            y = 3 * x;
            System.out.println("x=" + x + '\t'+ "y =" + y);
            x++;
        }
        while (x <= 10);
    }
}