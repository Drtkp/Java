import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("> Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = scanner.nextInt();

        if (x==1){
            System.out.println("> Выберите единицу измерения: 1 - грамм, 2 - килограмм");
            x = scanner.nextInt();
            System.out.println("> Введите число");
            double number = scanner.nextDouble();

            switch (x) {
                case (1):
                    System.out.println("> Граммы: " + number);
                    System.out.println("> Килограммы: " + number / 1000 );
                    break;
                case (2):
                    System.out.println("> Граммы: " + number * 1000);
                    System.out.println("> Килограммы: " + number);
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            x = scanner.nextInt();
            System.out.println("> Введите число");
            double number = scanner.nextDouble();

            switch (x) {
                case (1):
                    System.out.println("> Метры: "+ number);
                    System.out.println("> Мили: " + number/1609);
                    System.out.println("> Ярды: " + number*1.094);
                    System.out.println("> Футы: " + number*3.281);
                    break;
                case (2):
                    System.out.println("> Метры: "+ number*1609);
                    System.out.println("> Мили: " + number);
                    System.out.println("> Ярды: " + number*1760);
                    System.out.println("> Футы: " + number*5280);
                    break;
                case (3):
                    System.out.println("> Метры: "+ number*1.094);
                    System.out.println("> Мили: " + number/1760);
                    System.out.println("> Ярды: " + number);
                    System.out.println("> Футы: " + number/0.333);
                    break;
                case (4):
                    System.out.println("> Метры: "+ number/3.281);
                    System.out.println("> Мили: " + number/5280);
                    System.out.println("> Ярды: " + number*0.333);
                    System.out.println("> Футы: " + number);
                default:
                    break;

        }

    }
}
    }