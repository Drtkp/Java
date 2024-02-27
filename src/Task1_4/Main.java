package Task1_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Укажите операцию");
            String operation = scanner.nextLine();

            System.out.println("Введите первое число");
            int firstNum = Integer.parseInt(scanner.nextLine());

            System.out.println("Введите второе число");
            int secNum = Integer.parseInt(scanner.nextLine());

            System.out.println("Выполняем вычисления");

            switch (operation) {
                case "+":
                    System.out.println("Результат: " + calculator.calcAdditional(firstNum, secNum));
                    break;
                case "-":
                    System.out.println("Результат: " + calculator.calcDifference(firstNum, secNum));
                    break;
                case "/":
                    System.out.println("Результат: " + calculator.calcDivision(firstNum, secNum));
                    break;
                case "*":
                    System.out.println("Результат: " + calculator.calcMultiplication(firstNum, secNum));
                    break;
                default:
                    System.out.println("Операция отсутствует");

            }

        } catch (ArithmeticException e) {
            System.out.println("Ошибка вычисления");
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод данных");
        }

    }
}
