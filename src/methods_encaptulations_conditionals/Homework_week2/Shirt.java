package methods_encaptulations_conditionals.Homework_week2;

/**
 * Created by crc07 on 3/29/2017.
 */
public class Shirt {
    String description;
    char colorcode;
    double price;
    static int counter = 1;

    Shirt(String value1, char value2, double value3) {
        description = value1;
        colorcode = value2;
        price = value3;
        printProperties();
    }
    public void printProperties(){
        System.out.println("***** Shirt #"+(counter++)+" *****");
        System.out.println("Description: "+description);
        System.out.println("Color code: "+colorcode);
        System.out.println("Price: $"+price);
        System.out.println();
    }
}
