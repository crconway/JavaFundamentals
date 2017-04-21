package Interfaces;

import java.util.concurrent.TimeUnit;

/**
 * Created by crc07 on 4/18/2017.
 */
public class TryCatch {
   public static void main(String[] args) {
        try {
            for (int i = 0; i < 5 ; i++) {
                TimeUnit.SECONDS.sleep( 1 );
                System.out.println("i=" + i);
            }
        }catch (InterruptedException e) {
            System.out.println( "Sorry for the error ... please try again" );
            e.printStackTrace();
        }



}
