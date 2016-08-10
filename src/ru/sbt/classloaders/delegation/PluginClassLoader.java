package ru.sbt.classloaders.delegation;

import java.net.URL;
import java.net.URLClassLoader;

public class PluginClassLoader extends URLClassLoader {
    public PluginClassLoader(URL[] urls) {
        super(urls);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (name.startsWith("java") || name.equals("ru.sbt.classloaders.delegation.Plugin")) {
            return super.loadClass(name);
        }

        return findClass(name);
    }
}
