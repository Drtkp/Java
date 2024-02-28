import java.text.DecimalFormat;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##0.00");

        System.out.println("Введите текущий курс");
        double currentRate = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите количество Rub");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.println("USD: " + format.format(amount/currentRate));

    }
}
