package Task1_4;

public class Logic {


    public static String logic(Number firstNum, Number secNum, String operation) {

        Calculator calculator = new Calculator();

        String result = null;

        try {

            switch (operation) {
                case "+":
                    result = "Ответ " + calculator.calcAdditional(firstNum, secNum);
                    break;
                case "-":
                    result = "Ответ " + calculator.calcDifference(firstNum, secNum);
                    break;
                case "/":
                    result = "Ответ " + calculator.calcDivision(firstNum, secNum);
                    break;
                case "*":
                    result = "Ответ " + calculator.calcMultiplication(firstNum, secNum);
                    break;

            }

        } catch (ArithmeticException e) {
            result = "Ошибка вычисления";
        } catch (NumberFormatException e) {
            result = "Некорректный ввод данных";
        }
        return result;
    }
}
