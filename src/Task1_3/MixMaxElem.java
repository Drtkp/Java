package Task1_3;

import java.util.Random;

public class MixMaxElem {

    /**
     * @param args
     * @author Dmitrii Bulavko
     */

    public static void main(String[] args) {

        int[] arr = new int[20];
        int indNegative = 0;
        int indPositive = 0;
        int minPositive = 0;
        int maxNegative = 0;


        Random random = new Random();

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(-10, 10);

            if (Math.signum(arr[i]) > 0) {
                if (minPositive == 0) {
                    minPositive = arr[i];
                } else if (minPositive > arr[i]) {
                    minPositive = arr[i];
                    indPositive=i;
                }
            } else if (Math.signum(arr[i]) < 0) {
                if (maxNegative == 0) {
                    maxNegative = arr[i];
                } else if (maxNegative < arr[i]) {
                    maxNegative = arr[i];
                    indNegative=i;
                }
            }
        }
        
        arr[indNegative]=minPositive;
        arr[indPositive]=maxNegative;

    }

}
