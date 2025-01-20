package system.order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueOrEx = true;

        while (continueOrEx) {
            calcWall();

            System.out.println("Хотите выполнить программу снова? (y/n): ");
            String userInput = scanner.nextLine().trim().toLowerCase();

            if (!userInput.equals("y")) {
                continueOrEx = false;
            }
        }
        System.out.println("Программа завершена ");
        scanner.close();
    }



    //Калькулятор
    public static void calcWall() {
        Scanner scanner = new Scanner(System.in);

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
                System.out.println("Цена будет " + meter + "e");
            }
        } else {
            System.out.println("Вышло меньше 200e, нужно минимум 200e для выезда.");
        }
    }

}