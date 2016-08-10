package ru.sbt.classloaders.basics;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Calculator calculator = new Calculator();

        ClassLoader loader = Main.class.getClassLoader();
        Class<?> clazz = loader.loadClass("ru.sbt.classloaders.basics.Plugin");

        System.out.println(calculator.getClass() == clazz);
    }
}