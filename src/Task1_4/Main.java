package Task1_4;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Частное: " + calculator.calcDivision(1000,10));
        System.out.println("Разность: " + calculator.calcDifference(100,99));
        System.out.println("Произведение: " + calculator.calcMultiplication(10,200));
        System.out.println("Сумма: " + calculator.calcAdditional(1,2));

    }
}
