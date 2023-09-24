import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        zad1();
//        zad2();
        zad3();
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

    private static void zad3() {

        Random random = new Random();
        int liczba = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbe");

        int myNum = scanner.nextInt();

//        if (liczba == myNum) {
//            System.out.println("Bravo");
//        } else if (liczba > myNum) {
//            System.out.println("wylosowana liczba jest wieksza");
//        } else {
//            System.out.println("wylosowana liczba jest mniejsza");
//        }


        while (liczba != myNum) {
            if (liczba > myNum) {
                System.out.println("wylosowana liczba jest wieksza");
            } else {
                System.out.println("wylosowana liczba jest mniejsza");
            }
            myNum = scanner.nextInt();

        }

        System.out.println("bravo zgadłeś/aś");
    }


}

