package Task3;

import java.lang.annotation.Annotation;


/**
 * @author Serg KH
 * @version 1.0
 * @date 02022023
 */
@AnnoTest
public class SimpleClass {
    @Deprecated
    int num;
    String str = "String";

    /**
     * default constructor
     */
    public SimpleClass() {
    }

    /**
     * constructor with params
     */
    public SimpleClass(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public static void main(String[] args) {
        DerFromSimple dfs = new DerFromSimple();
        Class<?> cl = dfs.getClass();
        Annotation[] anns = cl.getAnnotations();
        System.out.println(anns.length);
        for (Annotation ann : anns) {
            System.out.println(ann.toString());
        }
        Class<?> cl1 = DerFromSimple.class;
        Annotation anno = cl1.getAnnotation(AnnoTest.class);
        System.out.println(anno);


    }
}


