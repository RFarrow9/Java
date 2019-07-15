package com.pluralsight.getorganised;

public class MathEquation {
    double leftVal;
    double rightVal;
    public char opCode;
    public double result;

    public double getLeftVal() {return this.leftVal;}
    public double getRightVal() {return this.rightVal;}
    public char getOpCode() {return this.opCode;}
    public double getResult() {return this.result;}

    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal- rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal/rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
    }
    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
        result = (int)result;
    }
}
