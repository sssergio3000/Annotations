package Task4;

import java.lang.reflect.Method;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Class<?> cl = calculator.getClass();
        try {
            Method meth = cl.getDeclaredMethod("calcul", int.class, int.class);
            Math math = meth.getAnnotation(Math.class);
            System.out.println(calculator.calcul(math.num1(), math.num2()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Math(num1 = 100, num2 = 200)
    private int calcul(int num1, int num2) {

        return num1 + num2;
    }

}
