package object_classes;

/**
 * Created by crc07 on 3/22/2017.
 */
public class StringArraryMain {
    public static void main(String[] args) {
        NameClass nameclass = new NameClass("Chris","Conway");


        NameClass nameClass1 = new NameClass();
        nameClass1.fname ="Scott";
        nameClass1.lname ="Another";
        nameclass.printName();
        nameClass1.printName();
    }
}
