package data_manipulation_and_inheritance.Homework_week3;

import java.util.ArrayList;

/**
 * Created by crc07 on 4/10/2017.
 */
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>(  );

        for (int i = 0; i < 10; i++) {
            myArray.add(i);  //assigning values into the array list
            System.out.println(myArray.get(i));  //retrieving values from array list
        }
        System.out.println("*****************************");
        //remove a value
        myArray.remove(7);
        for (Integer x:myArray) {
            System.out.println(x);


        }
    }
}
