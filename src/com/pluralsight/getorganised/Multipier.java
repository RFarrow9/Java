package com.pluralsight.getorganised;

public class Multipier extends CalculateBase {
    public Multipier() {}
    public Multipier(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
