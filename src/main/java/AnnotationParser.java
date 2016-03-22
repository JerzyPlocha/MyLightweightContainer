package main.java;

/**
 * Author: Jurek Plocha on 22/03/16.
 */
public class AnnotationParser {
    public void parse(Class<?> clazz) throws Exception {
        if (clazz.isAnnotationPresent(MyCustom.class)) {

        }
    }
}
