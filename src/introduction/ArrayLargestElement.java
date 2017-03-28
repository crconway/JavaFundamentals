package introduction;

/**
 * Created by crc07 on 3/17/2017.
 */
public class ArrayLargestElement {
    public static void main(String[] args) {
        double[] listSum = {5.6, 4.5, 3.3, 13.2, 4.0, 34.33, 34.0, 45.45, 99.993, 11123};
        double largest = listSum[0];
        //create loop to iterate throough array
        for (int i = 1; i < listSum.length; i++) {
                if (listSum[i] > largest)   {
               largest = listSum[i];
        }

    }
        System.out.println("Largest number is "+largest);
}
}
