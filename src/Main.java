public class Main {
    public static void main(String[] args) {
        zad1();
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


}