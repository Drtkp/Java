import java.util.Scanner;

public class Task7 {

    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i <size ; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int j = 0; j <=size; j++) {
            if (arr[j]==x || arr[j]==y || arr[j]==z){
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }

    }

}