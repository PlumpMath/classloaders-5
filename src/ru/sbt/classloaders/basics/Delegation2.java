package ru.sbt.classloaders.basics;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Delegation2 {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException {
        URL url = new URL("file://D:/matorin/classloaders/classes/");
        URLClassLoader initiating = new URLClassLoader(new URL[]{url}, null);
        Class<?> clazz = initiating.loadClass("ru.sbt.classloaders.basics.Plugin");

        System.out.println(clazz.getClassLoader());
    }
}