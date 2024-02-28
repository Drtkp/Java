import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();

        x = x.replaceAll("[а-яА-Я\\d]", "");
        x = x.replaceAll("\\s+", " ");
        String [] arr = x.split(" ");

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr.length);
    }
}
