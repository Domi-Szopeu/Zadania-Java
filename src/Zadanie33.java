public class Zadanie33 {
//    Napisz program, który za pomocą instrukcji while dla danych wartości
//    x zmieniających się od 0 do 10 oblicza wartość funkcji y = 3x.
    public static void main(String[] args) {
        int x,y;
        System.out.println("Dla y=3*x");
        x = 0;
        while (x <= 10) {
            y = 3 * x;
            System.out.println("x=" + x + '\t'+ "y =" + y);
            x++;
        }
    }
}
