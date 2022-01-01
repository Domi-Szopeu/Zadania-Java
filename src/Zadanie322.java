public class Zadanie322 {
//    Napisz program, który wyświetla duże litery alfabetu od A do Z i od Z do A
//    z wykorzystaniem pętli for.
    public static void main(String[] args) {
        char x;
        for (x = 'A'; x <= 'Z'; x++){
            if (x < 'Z'){
            System.out.print(x + ", ");}
            else System.out.print(x + ".");
        }
        System.out.println("");
        for (x = 'Z'; x >= 'A'; x--){
            if (x > 'A') {
                System.out.print(x + ", ");}
            else System.out.print(x + ".");
        }
    }
}
