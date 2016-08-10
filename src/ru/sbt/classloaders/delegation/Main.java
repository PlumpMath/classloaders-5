package ru.sbt.classloaders.delegation;

import java.net.URL;
import java.net.URLClassLoader;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        URL url = Plugin.class.getProtectionDomain()
                .getCodeSource()
                .getLocation();

        URLClassLoader loader = new URLClassLoader(new URL[]{url}, null);
//        Class<?> clazz = loader.loadClass(PluginImpl.class.getName());
//        Object pl = clazz.newInstance();
//
//        PluginImpl plugin = (PluginImpl) pl;
    }
}
