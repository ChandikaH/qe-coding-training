/**
 * @author chandikah
 * on 11/7/21
 */
public class CodeTest1 {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int i,j;
        double my_x;
        i = 5; j = 2;
        my_x = i*j*4.0;
        my_x=my_x%j;
        System.out.println(i+" "+j);
        System.out.println(my_x);
    }

    /**
    Hello
    */
    public static void returnResult(int x) {
        switch (x)
        {
            case 1:
            case 0:
                System.out.println(x);break;
            case 2:System.out.println(x);
            default:
                System.out.println(x);
        }
        System.out.println(x);
    }
}
