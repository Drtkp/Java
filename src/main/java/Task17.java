import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task17 {
    public static void main(String[] args) {

        System.out.println("Введите кол-во строк");
        Scanner scanner = new Scanner(System.in);
        int amt = scanner.nextInt();
        int count=0;
        String result = null;

        for (int i = 0; i <= amt; i++) {
            String word = scanner.nextLine();
            String[] arr = word.split("");
            Set<String> set = new HashSet<>(Arrays.asList(arr));

            if (set.size()>count) {
                count=set.size();
                result=word;
            }
        }

        System.out.println(result);

    }
}
