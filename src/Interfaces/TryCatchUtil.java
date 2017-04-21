package Interfaces;

import java.util.concurrent.TimeUnit;

/**
 * Created by crc07 on 4/18/2017.
 */
public class TryCatchUtil {

    public printCounter() throws InterruptedException{

            for (int i = 0; i < 5 ; i++) {
                TimeUnit.SECONDS.sleep( 1 );
                System.out.println("i=" + i);
            }

    }

}
