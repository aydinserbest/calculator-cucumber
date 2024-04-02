package calculator.domain;

public class MathOperation {
    private final String leftOperand;
    private final String rightOperand;
    private final String operator;

    public MathOperation(String leftOperand, String rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public String getLeftOperand() {
        return leftOperand;
    }

    public String getRightOperand() {
        return rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return  leftOperand + " " + operator+ " " +rightOperand ;
    }
}
