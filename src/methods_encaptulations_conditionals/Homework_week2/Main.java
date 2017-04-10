package methods_encaptulations_conditionals.Homework_week2;

/**
 * Created by crc07 on 3/31/2017.
 */
public class Main {

    public static void main(String[] args) {
        Utilities utils = new Utilities();
        //this is overloading
        utils.add( 3.3, 2 );
        utils.add( 3.45, 6.1 );
        utils.add( 2, 3.18 );
        utils.add( 10, 20 );

        for (int i = 0; i < 10; i++) {
            utils.randomHour( 24 );
        }

        //generate a 9 digit random number all the time
    }
}
