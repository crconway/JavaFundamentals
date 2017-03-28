package introduction;

/**
 * Created by crc07 on 3/16/2017.
 */
public class GradeExcercise {
    public static void main(String[] args) {
        int a = 70;
        String mess;

        if (a >= 90) {
            mess = "Grade is A";
        } else if (a <= 89 && a >= 80) {
            mess = "Grade is B";
        } else if (a <= 79 && a >= 70) {
            mess = "Grade is C";
        } else if (a <= 69 && a >= 60) {
            mess = "Grade is D";
        } else {
            if (a < 0) {
                mess = "Invalid grade";
            } else
                mess = "Grade is D";
            }
        System.out.println(mess);
    }
}