package Interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by crc07 on 4/17/2017.
 */
public class ListInterface {
    public static void main(String[] args) {
        // 1. Print an array of Strings
        String[] strArray = {"Matt","Kimberly","David","John","Chris","Nina","Pam","Tracy"};
        //for (String temp:strArray) {System.out.println(temp); }
        //2. Convert strArray into ArrayList
        List<String> myList = Arrays.asList( strArray );
        //for (String temp:strArray) {System.out.println(temp); }
        //3. Convert strArray into ArrayList
        ArrayList<String> myArrayList = new ArrayList<>( Arrays.asList( strArray ) );
        //for (String temp:strArray) {System.out.println(temp); }
        //System.out.println(myArrayList);  //this will print out all values as array
        //4. We want to convert the ArrayList int oa List
        List<String> myListFromArrayList = myArrayList;
       // for (String temp:myListFromArrayList) {System.out.println(temp); }
        //5. Apply lambdas found on the replaceAll list interface method to our List
        //short way to do Lambda exp
       // myList.replaceAll( s -> s.toUpperCase() );
        //myList.replaceAll( (String str ) -> {return str.toUpperCase();});
        //for (String temp:myList) System.out.println( temp );
        //6. Remove if length less than 5 characters - Predicate
        myArrayList.removeIf ( str -> str.length()< 5 ); //only works from ArrayList to List conversion
        //for (String temp:myArrayList) System.out.println( temp );
        //7. greater than 5 convert to uppercase  ??  replace name with upperCase is length greater than 5 using strArray
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length()>= 5 ){
                strArray[i] = strArray[i].toUpperCase();
            }
            System.out.println(strArray[i]);
        }
    }
}
