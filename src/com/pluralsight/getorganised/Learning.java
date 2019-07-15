package com.pluralsight.getorganised;

class Learning {
    static void main() {
        System.out.println("Test");
    }

    static void conditional_assignments() {
        int v1 = 7;
        int v2 = 5;
        int vMax = v1 > v2 ? v1 : v2;
        System.out.println(vMax);

        float students = 30f;
        float rooms = 4f;
        float studentsperroom = rooms == 0.0f ? 0.0f : students/rooms;
        System.out.println(studentsperroom);
    }

    static void blocks() {
        int v1 = 10, v2 = 10, diff;

        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger by " + diff);
        } else if (v2 > v1) {
            diff = v2 - v1;
            System.out.println("v2 is bigger by" + diff);
        }
        else System.out.println("v1 and v2 are equal");
    }

    static void nested_ifs() {
        float students = 0.0f;
        float rooms = 4f;
        if (students > 0.0f) {
            if (rooms > 0.0f)
                System.out.println(students/rooms);
        }
        else
            System.out.println("No students");
    }

    static void variable_scope() {
        float students = 30.0f;
        float rooms = 4.0f;

        if (rooms > 0.0f) {
            System.out.println(students);
            System.out.println(rooms);
            float avg = students / rooms;
            System.out.println(avg);
        }
        //avg no longer exists outside block
        //System.out.println(avg);
    }

    static void logical_operators() {
        int a = 20, b = 14, c = 5;
        if (a > b & b > c) //true, true
            System.out.println("a is greater than c");
        if (a < b | b > c) //false, true
            System.out.println("one of the above is true");
        if (a > b ^ b > c) //true, true  //Exclusive XOR
            System.out.println("Both are true, therefore false");
        if (!(a > b & b > c)) // not, true, true == (a <= b & b <= c)
            System.out.println("Evaluates to false");
        if (a < b && b > c) //false, true
            System.out.println("Right side isn't executed here!");
        if (a > b || b > c) //true, true
            System.out.println("Right side isn't executed here either!");

    }

    static void loops() {
        int kVal = 5;
        int factorial = 1;

        while(kVal > 1) //evaluate, then loop
            factorial *= kVal--;

        System.out.println(factorial);

        kVal = 5;
        factorial = 1;
        do { //loop, then evaluate
            factorial *= kVal--;
        } while(kVal > 1);

        System.out.println(factorial);
    }
    static void arrays() {
        float[] theVals = new float[3];
        //float[] theVals = {10f, 20f, 15f}; //alternative syntax
        //arrays start at 0
        theVals[0] = 10f;
        theVals[1] = 20f;
        theVals[2] = 15f;

        float sum = 0.0f;

        for (int i = 0; i < theVals.length; i++)
            sum += theVals[i];

        System.out.println(sum);
        theVals = null;
        sum = 0;

        //Can also use the for each loop
        float[] theVals2 = {10f, 20f, 15f, 50f};
        for (float currentVal : theVals2)
            sum += currentVal;

        System.out.println(sum);
    }
    static void switch_test() {
        int iVal = 25;

        switch(iVal % 2) {
            case 0:
                System.out.print(iVal);
                System.out.println(" is even");
                break;
            case 1:
                System.out.print(iVal);
                System.out.println(" is odd");
                break;
            default:
                System.out.println("Oops it broke");
                break;
        }
    }


}
