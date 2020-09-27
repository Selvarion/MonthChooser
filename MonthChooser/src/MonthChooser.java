import java.util.Scanner;

public class MonthChooser {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Podaj numer miesiąca od 1 do 12");

        while (!scann.hasNextInt()) {
            System.out.println("Błędne dane.");
            scann.next();
        }
        int month = scann.nextInt();

        switch (month) {
            case 1 -> System.out.println("Styczeń");
            case 2 -> System.out.println("Luty");
            case 3 -> System.out.println("Marzec");
            case 4 -> System.out.println("Kwiecień");
            case 5 -> System.out.println("Maj");
            case 6 -> System.out.println("Czerwiec");
            case 7 -> System.out.println("lipiec");
            case 8 -> System.out.println("Sierpień");
            case 9 -> System.out.println("Wrzesień");
            case 10 -> System.out.println("Październik");
            case 11 -> System.out.println("Listopad");
            case 12 -> System.out.println("Grudzień");
            default -> System.out.println("Podaj liczbę z przedziału od 1 do 12");
        }
    }
}
