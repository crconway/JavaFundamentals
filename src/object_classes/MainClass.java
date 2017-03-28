package object_classes;

/**
 * Created by crc07 on 3/23/2017.
 */
public class MainClass {

    static String str1 = "This is the sentence that is written in 2017";
    static String str2 = "Three eyes have I, all in a row; when the red one opens, all freeze.";
    public static void main(String[] args) {
        //instantiate
        // classname objectname = new classname()
        UtilitiesClass uClass = new UtilitiesClass();
        uClass.printNumDivisibleBySeven();
        uClass.addAllNumbersLoop();
        uClass.findStringLength(str1);
        uClass.findCharDistribution(str1);
        uClass.replaceChar( str2 );


    }
}
