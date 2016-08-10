package ru.sbt.classloaders;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Calculator calculator = new Calculator();

        ClassLoader loader = Main.class.getClassLoader();
        Class<?> clazz = loader.loadClass("ru.sbt.classloaders.Calculator");

        System.out.println(calculator.getClass() == clazz);
    }
}