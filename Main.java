import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год в формате yyyy");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println("Колиичесво дней: 365");
        }else if (year % 100 == 0) {
            System.out.println("Колличесво дней: 365");
        } else if (year % 4 == 0) {
            System.out.println("Колличесво дней: 366");
        }else
            System.out.println("Колличесво дней: 365");
    }
}