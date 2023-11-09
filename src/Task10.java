import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int secSize = scanner.nextInt();

        int[][] arr = new int[size][size];

        for (int i = 0; i < size ; i++) {
            int [] x = new int [secSize];
            for (int j = 0; j <secSize ; j++) {
                x[j]=scanner.nextInt();
            }
            arr[i]=x;
        }

        for (int i = 0; i < secSize ; i++) {
            System.out.println(arr[0][i]*3);
        }


    }
}
