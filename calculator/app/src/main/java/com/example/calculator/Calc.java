package com.example.calculator;

public class Calc {
    double a;
    double b;

    Calc(double x, double y)
    {
        a=x;
        b=y;
    }

    double Addition()
    {
        return a+b;
    }

    double Subtraction()
    {
        return a-b;
    }

    double Multiplication()
    {
        return a*b;
    }

    double Division()
    {
        return a/b;
    }


}
