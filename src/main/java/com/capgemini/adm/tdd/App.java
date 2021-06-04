package com.capgemini.adm.tdd;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    private static int counter;

    private final List<String> arguments;
    private final int count = counter++;

    public App(List<String> arguments) {
        this.arguments = arguments;
    }

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        new App(Arrays.asList(args));
    }

    public List<String> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "App" + arguments + " #" + count;
    }
}
