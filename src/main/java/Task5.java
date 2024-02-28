import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        String z = scanner.nextLine();

        switch (z) {
            case ("+"):
                System.out.println(x+y);
                break;
            case ("-"):
                System.out.println(x-y);
                break;
            case ("*"):
                System.out.println(x*y);
                break;
            case ("/"):
                System.out.println(x/y);
                break;
            default:
                break;
        }

    }
}
