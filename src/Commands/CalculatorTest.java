package Commands;

import org.junit.Assert;

import java.util.ArrayList;


class CalculatorTest {

    @org.junit.jupiter.api.Test
    void calculate() {

        double x1 = 0;
        double y1 = 0;
        double R1= 0;

        double x2 = -1;
        double y2 = -2;
        double R2 = 2;

        double x3 = 2;
        double y3 = 0;
        double R3 = 2;

        double x4 = -1.6;
        double y4 = -1.2;
        double R4 = 4;

        double x5 = 0.8;
        double y5 = 0.1;
        double R5 = 2;

        double x6 = 1.5;
        double y6 = 1.5;
        double R6 = 4;

        double x7 = -1;
        double y7 = 1;
        double R7 = 8;

        double x8 = 0;
        double y8 = 1;
        double R8 = 2;

        double x9 = -1;
        double y9 = 1;
        double R9 = 0;

        double x10 = 3;
        double y10 = 0.1;
        double R10 = 4;

        double x11 = -2;
        double y11 = -2;
        double R11 = 4;

        double x12 = 0;
        double y12 = -3;
        double R12 = 4;

        double x13 = -1.3;
        double y13 = -0.7;
        double R13 = 2;

        double x14 = -0.9;
        double y14 = -7.2;
        double R14 = 5;

        double x15 = 5.3;
        double y15 = 5.5;
        double R15 = 6;

        double x16 = 0;
        double y16 = 4;
        double R16 = 3;

        double x17 = 0;
        double y17 = -7;
        double R17 = 6;

        double x18 = -10;
        double y18 = 0;
        double R18 = 17.5;

        double x19 = 15.3;
        double y19 = 0;
        double R19 = 15.2;

        double x20 = 0.5;
        double y20 = -0.5;
        double R20 = 4;

        double x21 = -0.4;
        double y21 = -1.7;
        double R21 = 3;

        ArrayList<String> expected = new ArrayList<>();

        expected.add(Calculator.Calculate(x1,y1,R1));
        expected.add(Calculator.Calculate(x2,y2,R2));
        expected.add(Calculator.Calculate(x3,y3,R3));
        expected.add(Calculator.Calculate(x4,y4,R4));
        expected.add(Calculator.Calculate(x5,y5,R5));
        expected.add(Calculator.Calculate(x6,y6,R6));
        expected.add(Calculator.Calculate(x7,y7,R7));
        expected.add(Calculator.Calculate(x8,y8,R8));
        expected.add(Calculator.Calculate(x9,y9,R9));
        expected.add(Calculator.Calculate(x10,y10,R10));
        expected.add(Calculator.Calculate(x11,y11,R11));
        expected.add(Calculator.Calculate(x12,y12,R12));
        expected.add(Calculator.Calculate(x13,y13,R13));
        expected.add(Calculator.Calculate(x14,y14,R14));
        expected.add(Calculator.Calculate(x15,y15,R15));
        expected.add(Calculator.Calculate(x16,y16,R16));
        expected.add(Calculator.Calculate(x17,y17,R17));
        expected.add(Calculator.Calculate(x18,y18,R18));
        expected.add(Calculator.Calculate(x19,y19,R19));
        expected.add(Calculator.Calculate(x20,y20,R20));
        expected.add(Calculator.Calculate(x21,y21,R21));

        ArrayList<String> actual = new ArrayList<>();

        actual.add("successful hit");
        actual.add("successful hit");
        actual.add("successful hit");
        actual.add("successful hit");
        actual.add("successful hit");
        actual.add("unsuccessful hit");
        actual.add("unsuccessful hit");
        actual.add("successful hit");
        actual.add("unsuccessful hit");
        actual.add("unsuccessful hit");
        actual.add("successful hit");
        actual.add("successful hit");
        actual.add("unsuccessful hit");
        actual.add("unsuccessful hit");
        actual.add("unsuccessful hit");
        actual.add("unsuccessful hit");
        actual.add("unsuccessful hit");
        actual.add("unsuccessful hit");
        actual.add("unsuccessful hit");
        actual.add("successful hit");
        actual.add("successful hit");


        Assert.assertEquals(expected, actual);

    }
}