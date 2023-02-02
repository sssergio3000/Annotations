package Task3;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited

public @interface AnnoTest {

    String str() default "Time";

    int num() default 5;
}
