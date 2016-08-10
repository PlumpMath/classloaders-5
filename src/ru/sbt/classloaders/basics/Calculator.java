package ru.sbt.classloaders.basics;

public class Calculator {
    static {
        System.out.println("Plugin.static initializer");
    }

    public int calc() {
        return 10000000;
    }
}
