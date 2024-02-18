import java.util.Scanner;

public class Task1_1 {

    /**
     * @param args
     * @author Dmitrii Bulavko
     * @see #calc()
     */
    public static void main(String[] args) {

        System.out.printf("Результат вычесления %.4f", calc());

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