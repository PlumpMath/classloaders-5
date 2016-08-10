package ru.sbt.classloaders;

public class Calculator {
    static {
        System.out.println("Calculator.static initializer");
    }

    public int calc() {
        return 10000000;
    }
}
