import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        double[] arr = new double[size];
        double sum = 0;

        for (int i = 0; i <size ; i++) {
            arr[i] = scanner.nextDouble();
        }

        for (int i = 0; i <size ; i++) {
            sum+=arr[i];
        }

        double avg = sum/size;

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]*avg);
        }

    }
}
