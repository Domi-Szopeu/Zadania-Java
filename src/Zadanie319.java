public class Zadanie319 {
//    Napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100
//    z wykorzystaniem podwójnej pętli for.
    public static void main(String[] args) {
        int x,y,z;
        for (y = 0; y <=100; y++)
            System.out.print(y + " | ");
        System.out.println("");
        for (x = 1; x <= 100; x++) {
            System.out.print(x + " | ");
            for (y = 1; y <= 100; y++) {
                z = x * y;
                System.out.print(z + " | ");
            }
            System.out.println("");
        }
    }
}
