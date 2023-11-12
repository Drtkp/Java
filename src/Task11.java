import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        int y  = scanner.nextInt();

        System.out.println(Math.max(Integer.parseInt(x),y));
        System.out.println(Math.min(Double.parseDouble(x),y));

    }

}
