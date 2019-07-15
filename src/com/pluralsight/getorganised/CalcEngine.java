package com.pluralsight.getorganised;

class CalcEngine {
    public static void Engine() {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100, 50);
        equations[1] = new MathEquation('a', 25, 92);
        equations[2] = new MathEquation('s', 225,17);
        equations[3] = new MathEquation('m', 11, 3);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("Result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(40d, 8d);
        System.out.println(equationOverload.getResult());

        MathEquation equationOverloadint = new MathEquation('d');
        equationOverloadint.execute(9, 4);
        System.out.println(equationOverloadint.getResult());
    }
}
