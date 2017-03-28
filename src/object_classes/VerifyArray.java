package object_classes;


import oracle.jrockit.jfr.StringConstantPool;

/**
 * Created by crc07 on 3/27/2017.
 */
public class VerifyArray {
    public static void main(String[] args) {
        String[]names = {"Debbie","Kim","Colby","Tracy","Mark", "Adam", "Doug", "Matt", "John","Chris","Nina","David","Pamela","C"};
        //any name that ends with a and has one or more characters before it
        String matcher1 = "^[A-Za-z]+a$";
        //any name that starts with C or M and has one or more characters after it
        String matcher2 = "^[CM][a-z]+";
        //any name that ends with a and has zero or more characters before it
        String matcher3 = "^[CM][a-z]*";
        //any name with an 'a' or 'A'
        String matcher4 = ".*[aA]{1}.*";


        //Foreach format
        for (String temp:names) {
            if ( temp.matches(matcher4) ){
                System.out.println(temp);
            }

        }
        /*System.out.println("***************************");
        //for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }*/

    }
}
