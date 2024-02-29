package Task1_4;

import java.util.Scanner;

public class Program {

    public static void program() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите второе число");
        int secNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите операцию");
        String oper = scanner.nextLine();


        System.out.println("Выполняем вычисления");

        System.out.println(Logic.logic(firstNum,secNum,oper));


    }
    
}
