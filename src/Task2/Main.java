package Task2;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        AnnoCalc ac = new AnnoCalc();
        Class<?> cl = ac.getClass();
        try {
            Method meth = cl.getDeclaredMethod("calc", int.class, int.class);
            MyAnno myAnno = meth.getAnnotation(MyAnno.class);
            System.out.println(ac.calc(myAnno.num1(), myAnno.num2()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }


}

