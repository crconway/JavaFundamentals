package object_classes;

/**
 * Created by crc07 on 3/20/2017.
 */
public class MyMainClass {

    public static void main(String[] args) {
        // Instantiating the math1 object as a copy of MathUtils class
        MathUtil math1 = new MathUtil(0,0);

        // Instantiating the math2 object as a copy of MathUtils class
        MathUtil math2 = new MathUtil(45,30);


        // Overwriting the field variables for the math1 object
        math1.i = 20;
        math1.y = 7;

        // Do whatever
        System.out.println(math1.add());
        System.out.println(math2.subtract());
        System.out.println(math1.division());
        System.out.println(math1.multiplication());
    }


}
