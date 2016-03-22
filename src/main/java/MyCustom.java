package main.java;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Author: Jurek Plocha on 22/03/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustom {

    String text() default "sun";
    int number() default 1;
}
