package org.example;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Class<?> stringClass = String.class;
        Method[] methods = stringClass.getMethods();

        Set<String> unMethods = new HashSet<>();

        for(Method method : methods) {
            unMethods.add(method.getName());
        }

        for(String name : unMethods) {
            System.out.println(name);
        }
    }
}