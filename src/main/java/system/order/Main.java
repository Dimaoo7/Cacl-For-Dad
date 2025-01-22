package system.order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueOrEx = true;

        while (continueOrEx) {
            System.out.print("Введите цифру 1.Резание 2.Бурение: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                calcRez(scanner);
            } else {
                calcBur(scanner);
            }

            System.out.println("Хотите выполнить программу снова? (y/n): ");
            scanner.nextLine();
            String userInput = scanner.nextLine().trim().toLowerCase();

            if (!userInput.equals("y")) {
                continueOrEx = false;
            }
        }
        System.out.println("Программа завершена ");
    }


    public static void calcRez(Scanner scanner) {

        System.out.print("Ширина стены в см: ");
        float wallQuestion = scanner.nextFloat() * 2;

        System.out.print("Сколько метров хотите?: ");
        int meter = (int) (scanner.nextFloat() * wallQuestion);

        scanner.nextLine();

        if (meter > 200) {
            System.out.print("Хотите скидку? (y/n): ");
            String choose = scanner.nextLine().trim().toLowerCase();
            if (choose.equals("y")) {
                System.out.print("Сколько процентов?: ");
                int numOfPercent = scanner.nextInt();
                float discount = (float) (meter * numOfPercent) / 100;
                int priceWithDiscount = (int) (meter - discount);
                System.out.println("Цена будет " + meter + "e, а со скидкой " + priceWithDiscount + "e");
            } else {
                System.out.printf("Цена будет %.2fе%n", (double) meter);

            }
        } else {
            System.out.println("Вышло "+ meter+" ,а нужно минимум 200e для выезда.");
        }
    }

    public static void calcBur(Scanner scanner) {
        System.out.println("""
                Самое популярное:
                - 110: вентиляция в ванной комнате
                - 120: дымоход
                - 130: вытяжка
                """);

        System.out.print("Какой фи? 1метр 100см: ");
        int fi = scanner.nextInt();
        switch (fi) {
            case 50, 60, 70, 80 -> easierWay(1.25, scanner);
            case 100 -> easierWay(2.5, scanner);
            case 110 -> easierWay(2.75, scanner);
            case 120 -> easierWay(3, scanner);
            case 130 -> easierWay(3.25, scanner);
            case 160 -> easierWay(4, scanner);
            case 180 -> easierWay(4.5, scanner);
            case 200 -> easierWay(5, scanner);
            case 250 -> easierWay(6.25, scanner);
            case 300 -> easierWay(7.5, scanner);
            case 350 -> easierWay(8.75, scanner);
            default -> System.out.println("Похоже вы указали неверное число");
        }
    }

    public static void easierWay(double price, Scanner scanner ) {
        System.out.printf("%.2fе см%n", price);
        System.out.print("Сколько см нужно?: ");
        double cm = scanner.nextDouble();
        double result = cm * price;
        if (result > 500) {
            double discount = (result * 10) / 100;
            double priceWithDiscount = result - discount;
            System.out.printf("%.2fе это большой проект, скидка будет 10 процентов: %.2fе%n", result, priceWithDiscount);
        }else System.out.printf("Вышло: %.2fе%n", result);
    }
}
