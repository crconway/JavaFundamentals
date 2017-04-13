package Interfaces;

/**
 * Created by crc07 on 4/13/2017.
 */
public interface InterA {
    default void identifyInterface(){
        System.out.println("This is the interface ... ");
        returnStaticMessage();
    }
    void returnMessage();

    static void returnStaticMessage(){
        System.out.println("This is status method from the interface ...");
    }

}
