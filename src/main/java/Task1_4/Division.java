package Task1_4;

public class Division implements Calculate {

    @Override
    public Number calc(Number firstNum, Number secNum) {
        return trans(firstNum, secNum);
    }

    private Number trans(Number firstNum, Number secNum) {
        if (firstNum instanceof Double || secNum instanceof Double) {
            return firstNum.doubleValue() / secNum.doubleValue();
        } else if (firstNum instanceof Float || secNum instanceof Float) {
            return firstNum.floatValue() / secNum.floatValue();
        } else if (firstNum instanceof Long || secNum instanceof Long) {
            return firstNum.longValue() / secNum.longValue();
        } else return firstNum.intValue() / secNum.intValue();
    }

}
