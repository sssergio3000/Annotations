package Task2;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnno {

    int num1() default 4;

    int num2() default 0;
}