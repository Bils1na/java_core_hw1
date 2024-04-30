package org.example.task;

import org.example.services.Calculator;
import org.example.utils.Decorator;

public class Program {

    public static void main(String[] args) {
        int result = Calculator.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = Calculator.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = Calculator.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = Calculator.div(2, 2);
        System.out.println(Decorator.decorate(result));
    }

}
