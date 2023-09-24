import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

zad1();
    }

    private static void zad1() {
        System.out.println("Podaj liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba > 0) {
            System.out.println("Liczba jest dodatnia.");

        } else if (liczba < 0) {
            System.out.println("Liczba jest ujemna.");

        } else {
            System.out.println("Liczba jest rowna zero.");
        }

    }

}







