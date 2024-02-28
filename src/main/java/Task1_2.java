import java.util.Arrays;
import java.util.Scanner;

public class Task1_2 {

    /**
     * @param args
     * @author Dmitrii Bulavko
     * @see #calc(),#getMaxArrayWord()
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию");
        String i = scanner.nextLine();

        if (i.equals("1")) {
            System.out.printf("Результат вычисления %.4f", calc());
        } else if (i.equals("2")) {
            System.out.println("Результат вычисления: " + getMaxArrayWord());
        }

    }


    /**
     * @return String result
     */
    public static String getMaxArrayWord() {
        Scanner scanner = new Scanner(System.in);

        String result = "";

        //Задаем массив
        String[] arr = new String[Integer.parseInt(scanner.nextLine())];

        for (int i = 0; i <= arr.length - 1; i++) {
            String word = scanner.nextLine();
            arr[i] = word;

            if (word.length() > result.length()) {
                result = word;
            }

        }

        return result;

    }


    /**
     * @return double result
     */
    public static double calc() {
        Scanner scanner = new Scanner(System.in);

        //Вводим дробные числа
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        //Вводим нужную операцию
        String z = scanner.nextLine();

        double result = 0;

        //Вычисляем
        switch (z) {
            case ("+"):
                result = x + y;
                break;
            case ("-"):
                result = x - y;
                break;
            case ("*"):
                result = x * y;
                break;
            case ("/"):
                result = x / y;
                break;
            default:
                break;
        }

        return result;
    }


}
