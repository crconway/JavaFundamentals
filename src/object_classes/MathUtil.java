package object_classes;

/**
 * Created by crc07 on 3/20/2017.
 */
public class MathUtil {
    int i;
    int y;

    MathUtil(int x1, int x2) {
        i = x1;
        y = x2;
    }

    public int add() {
        return i+y;
    }

    public int subtract() {
        return i-y;
    }
    public int multiplication() {
        return i*y;
    }

    public double division() {

        //casting change the type of i
        return (double) i/y;
    }

}

