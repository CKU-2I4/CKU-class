public class Main {
    public static void main(String[] args) {
//        zad1();
        zad2();
    }

    private static void zad1() {
        int liczba = -4;

        if (liczba > 0) {
            System.out.println("Podana liczba jest dodatnia.");
        } else if (liczba < 0) {
            System.out.println("Podana liczba jest ujemna.");
        } else {
            System.out.println("Podana liczba jest równa zeru.");
        }

    }

    private static void zad2() {

        for (int i = 1; i < 21; i++) {
            System.out.println(i);
        }
    }


}

