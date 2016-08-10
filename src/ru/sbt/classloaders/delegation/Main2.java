package ru.sbt.classloaders.delegation;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, MalformedURLException {
        URL url = new URL("file://D:/matorin/classloaders/classes/");

        URLClassLoader loader = new PluginClassLoader(new URL[]{url});
        Class<?> clazz = loader.loadClass("ru.sbt.classloaders.delegation.PluginImpl");
        Object pl = clazz.newInstance();

        Plugin plugin = (Plugin) pl;
        plugin.execute();

        Plugin plugin2 = new PluginImpl();
        plugin2.execute();
    }
}
