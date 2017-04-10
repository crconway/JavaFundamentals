package methods_encaptulations_conditionals.Homework_week2;

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
        uClass.printNumDivisibleBySeven(0,1000);
        System.out.println(uClass.countNumberDivisiblebySeven( 0,1000 ));
        uClass.addAllNumbersLoop(0,1000);
        System.out.println("Length of string: "+ uClass.findStringLength(str1) );
        uClass.findCharDistribution(str1);
        uClass.replaceChar( str2 );
        uClass.replaceStringChar(str2);
        //countNumberSeries(1,1000);


    }

    public static void countNumberSeries(int start, int stop) {
        int x = 0;
        //hdr = "countNumberSeries";
        //headerMethod(hdr);
        for (int i = 0; i < 100; i++) {
            x += i;
        }
        System.out.println( "Sum of adding all numbers from "+start+ " to "+stop +"= " + x );

    }
}
