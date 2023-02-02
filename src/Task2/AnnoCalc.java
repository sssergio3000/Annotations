package Task2;

/**
 * @author serg
 * class for summation of two numbers via reflection
 */
public class AnnoCalc {
    /**
     * Constructor for AnnoCalc default
     *
     * @param
     */
    AnnoCalc() {

    }


    @MyAnno
/**
 * @param int num1 int num2
 * @return inter
 *
 */
    public int calc(int n1, int n2) {
//    System.out.println(n1+n2);
        return n1 + n2;
    }
}




