package model;

public class Calculator {
    private String firstOperand;
    private String secondOperand;
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String  result) {
        this.result = result;
    }

    public String getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(String firstOperand) {
        this.firstOperand = firstOperand;
    }

    public String getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(String secondOperand) {
        this.secondOperand = secondOperand;
    }
}
