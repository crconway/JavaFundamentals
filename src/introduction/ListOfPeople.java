package introduction;

/**
 * Created by crc07 on 3/17/2017.
 */
public class ListOfPeople {
    public static void main(String[] args) {
        double sum = 0;
        double[] listSum = {5.6, 4.5, 3.3, 13.2, 4.0, 34.33, 34.0, 45.45, 99.993, 11123};
        //create loop to iterate throough array
        for (int i = 0; i < listSum.length; i++) {
            sum = sum + listSum[i];
        }
        System.out.println("Sum = "+sum);
    }
}
