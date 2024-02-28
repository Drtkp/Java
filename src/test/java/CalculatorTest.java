import Task1_4.Calculator;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class CalculatorTest {

    @Test
    public void calculatorAdditionalTest(){

        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.calcAdditional(1,5),6,
                "Неверный результат вычисления.Ожидаемый результат 6");
        Assert.assertEquals(calculator.calcAdditional(0.66,0.55),1.21,
                "Неверный результат вычисления.Ожидаемый результат 1.21");

    }

    @Test
    public void calculatorDifferenceTest(){

        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.calcDifference(1,5),-4,
                "Неверный результат вычисления.Ожидаемый результат -4");
        Assert.assertEquals(calculator.calcDifference(10000,9000),1000,
                "Неверный результат вычисления.Ожидаемый результат 1000");

    }

    @Test
    public void calculatorMultiplicationTest(){

        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.calcMultiplication(0,5),0,
                "Неверный результат вычисления.Ожидаемый результат 0");
        Assert.assertEquals(calculator.calcMultiplication(1, -1),-1,
                "Неверный результат вычисления.Ожидаемый результат -1");
        Assert.assertEquals(calculator.calcMultiplication(777, 888),689976,
                "Неверный результат вычисления.Ожидаемый результат 689976");


    }

    @Test
    public void calculatorDivisionTest(){

        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.calcDivision(0,5),0,
                "Неверный результат вычисления.Ожидаемый результат 0");
        Assert.assertEquals(calculator.calcDivision(100, 50),2,
                "Неверный результат вычисления.Ожидаемый результат -2");

    }

}
