package Task1_4;

public class Calculator {

    private static final DifferenceCalc differenceCalc;
    private static final AdditionCalc additionCalc;
    private static final Division division;
    private static final Multiplication multiplication;


    static {
        differenceCalc = new DifferenceCalc();
        additionCalc = new AdditionCalc();
        division = new Division();
        multiplication = new Multiplication();
    }

    public Number calcAdditional (Number firstNum , Number secNum) {
        return additionCalc.calc(firstNum,secNum);
    }

    public Number calcDifference (Number firstNum , Number secNum) {
        return differenceCalc.calc(firstNum,secNum);
    }

    public Number calcDivision (Number firstNum , Number secNum) {
        return division.calc(firstNum,secNum);
    }

    public Number calcMultiplication (Number firstNum , Number secNum) {
        return multiplication.calc(firstNum,secNum);
    }

}
