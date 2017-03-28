package object_classes;

/**
 * Created by crc07 on 3/24/2017.
 */
public class MatchesRegex {
    public static void main(String[] args) {
        String str = "True";

        if(str.matches( "[tT]rue" )){
            System.out.println("Pass");
        }
    }
}
