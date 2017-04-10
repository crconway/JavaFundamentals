package methods_encaptulations_conditionals.Homework_week2;

/**
 * Created by crc07 on 3/31/2017.
 */
public class Utilities {

    //example of overloading a method

    public void add(int a, int b){
        System.out.println("Two Integers: " +(a+b));
    }
    public void add(double a, double b){
        System.out.println("Two doubles: " +(a+b));
    }
    public void add(int a, double  b){
        System.out.println("Mix Int&Double: " +(a+b));
    }
    public void add(double a, int b){
        System.out.println("Mix Double&Int: " +(a+b));
    }

    public static void randomHour(int end){

        //ternary operator --
        // (conditional expression)?(value for true):(value for false)

        //boolean = (Math.random() > .5)?true:false;
        System.out.println((int)(Math.random()*end)+1);

    }



}
