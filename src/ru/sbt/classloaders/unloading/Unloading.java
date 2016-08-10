package ru.sbt.classloaders.unloading;

import ru.sbt.classloaders.delegation.Plugin;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class Unloading {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        URL url = Person.class.getProtectionDomain()
                .getCodeSource()
                .getLocation();

        List<ClassLoader> loaders = new ArrayList<>();
        for (int i = 0; i < 1000_000_000; i++) {
            URLClassLoader loader = new URLClassLoader(new URL[]{url}, null);
            loader.loadClass(Person.class.getName()).newInstance();

            loaders.add(loader);
        }
    }
}
