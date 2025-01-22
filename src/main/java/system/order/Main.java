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
                calcRez();
            } else {
                calcBur();
            }

            System.out.println("Хотите выполнить программу снова? (y/n): ");
            String userInput = scanner.nextLine().trim().toLowerCase();

            if (!userInput.equals("y")) {
                continueOrEx = false;
            }
        }
        System.out.println("Программа завершена ");
        scanner.close();
    }


    public static void calcRez() {
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
            System.out.println("Вышло "+ meter+" ,а нужно минимум 200e для выезда.");
        }
    }

    public static void calcBur() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Самое популярное " +
                "110 za ventilaciju u kupatilo," +
                "120 dimnjak," +
                " 130 aspirator");

        double cm;
        double result;
        System.out.print("Какой фи? 1метр 100см: ");
        int fi = scanner.nextInt();
        switch (fi) {
            case 50, 60, 70, 80 -> {
                System.out.println("1.25e cm");
                System.out.print("Сколько см нужно?: ");
                double price = 1.25;
                cm = scanner.nextFloat();
                result = cm * price;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            case 100 -> {
                System.out.println("2.5e cm");
                System.out.print("Сколько см нужно?: ");
                cm = scanner.nextFloat();
                result = cm * 2.5f;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            case 110 -> {
                System.out.println("2.75e cm");
                System.out.print("Сколько см нужно?: ");
                cm = scanner.nextFloat();
                result = cm * 2.75f;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            case 120 -> {
                System.out.println("3e cm");
                System.out.print("Сколько см нужно?: ");
                cm = scanner.nextFloat();
                result = cm * 3f;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            case 130 -> {
                System.out.println("3.25e cm");
                System.out.print("Сколько см нужно?: ");
                cm = scanner.nextFloat();
                result = cm * 3.25f;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            case 160 -> {
                System.out.println("4e cm");
                System.out.print("Сколько см нужно?: ");
                cm = scanner.nextFloat();
                result = cm * 4f;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            case 180 -> {
                System.out.println("4.5e cm");
                System.out.print("Сколько см нужно?: ");
                cm = scanner.nextFloat();
                result = cm * 4.5f;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            case 200 -> {
                System.out.println("5e cm");
                System.out.print("Сколько см нужно?: ");
                cm = scanner.nextFloat();
                result = cm * 5f;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            case 250 -> {
                System.out.println("6.25e cm");
                System.out.print("Сколько см нужно?: ");
                cm = scanner.nextFloat();
                result = cm * 6.25f;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            case 300 -> {
                System.out.println("7.5e cm");
                System.out.print("Сколько см нужно?: ");
                cm = scanner.nextFloat();
                result = cm * 7.5f;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            case 350 -> {
                System.out.println("8.75e cm");
                System.out.print("Сколько см нужно?: ");
                cm = scanner.nextFloat();
                result = cm * 8.75f;
                if (result > 500) {
                    double discount = (result * 10) / 100;
                    int priceWithDiscount = (int) (result - discount);
                    System.out.println(result + "е это большой проект скидка будет 10 процентов" + priceWithDiscount + "e ");
                }else System.out.println("Вышло " + result + "e ");
            }
            default -> System.out.println("Похоже вы указали неверное число");



        }
    }

    private static void extracted(float result) {
        System.out.println(result + "е это большой проект скидка будет 10 процентов");
    }

}