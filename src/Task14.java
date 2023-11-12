import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random random = new Random();

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(-21,21);
        }

        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).min().getAsInt());

        int modMax = Arrays.stream(arr).map(Math::abs).max().getAsInt();

        System.out.println(modMax);


    }
}
