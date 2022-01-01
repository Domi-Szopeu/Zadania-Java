public class Funkcje {

    public static void funkcja(int a){
        a = a * 2;
        a = a + 3;
        System.out.println(a);
    }

    public static int funkcja2(int a){
        a = a * 2;
        a = a + 3;
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        funkcja2(a);
        a = funkcja2(a);
        a = funkcja2(a);
        a = funkcja2(a);
        a = funkcja2(a);

    }
}
