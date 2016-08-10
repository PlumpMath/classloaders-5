package ru.sbt.classloaders.delegation;

public class PluginImpl implements Plugin {
    @Override
    public void execute() {
        System.out.println("22222222");
    }
}
