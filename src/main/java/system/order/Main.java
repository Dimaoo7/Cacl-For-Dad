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

        System.out.print("Ширина стены: ");
        float wallQuestion = scanner.nextFloat() * 2;

        System.out.print("Сколько метров хотите?: ");
        float meter = scanner.nextFloat() * wallQuestion;

        if (meter < 200) {
            System.out.println("Вышло меньше 200е минимум 200 для выезда");
        } else {
            System.out.println("Цена будет "+ meter);
            System.out.print("Хотите скидку?: ");
            String choose = scanner.nextLine().trim().toLowerCase();
            if (choose.equals("y")) {
                System.out.println("Сколько процентов?: ");
                int numOfPercent = scanner.nextInt();
                float percent = meter;
            }
        }


    }
}