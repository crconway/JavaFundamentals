package object_classes;

/**
 * Created by crc07 on 3/23/2017.
 */
public class UtilitiesClass {

    private String strPhrase;
    private int counterA = 0;
    private int counterC = 0;
    private int counterN = 0;
    private String strHeader;
    private String hdr;
    //public UtilitiesClass(String str){
    //     strPhrase = str;

    public int x;

    public void printNumDivisibleBySeven() {
        hdr = "printNumDivisibleBySeven";
        headerMethod(hdr);
        System.out.println( "1 - 1000 Numbers Divisible by Seven" );
        for (int i = 0; i < 1000; i++) {
            if ( i % 7 == 0 ) {
                System.out.println( i );
            }
        }

    }

    public void addAllNumbersLoop() {
        hdr = "addAllNumbersLoop";
        headerMethod(hdr);
        for (int i = 0; i < 100; i++) {
                x += i;
            }
            System.out.println( "Sum of adding all numbers from 1 to 100 is : " + x );

        }

        public void findStringLength(String str) {
            hdr = "findStringLength";
            headerMethod(hdr);
            strPhrase = str;
            System.out.println( "String is : " + strPhrase );
            System.out.println( "Total number of characters: " + strPhrase.length() );

        }

        public void findCharDistribution(String str) {
            hdr = "findCharDistribution";
            headerMethod(hdr);
            strPhrase = str;
            if ( strPhrase.length() > 20 ) {
                char[] arryChar = strPhrase.toCharArray();
                for (int i = 0; i < arryChar.length; i++) {
                    if ( arryChar[ i ] == 'a' ||
                            arryChar[ i ] == 'e' ||
                            arryChar[ i ] == 'i' ||
                            arryChar[ i ] == 'u' ||
                            arryChar[ i ] == 'o' ||
                            arryChar[ i ] == 'A' ||
                            arryChar[ i ] == 'E' ||
                            arryChar[ i ] == 'I' ||
                            arryChar[ i ] == 'U' ||
                            arryChar[ i ] == 'O' ) {
                        ++counterA;
                    } else if ( !Character.isDigit( arryChar[ i ] ) )
                        ++counterC;
                    else {
                        ++counterN;
                    }

                }
                System.out.println( "Vowel Count = " + counterA + " Constant count = " + counterC + " Number count = " + counterN );
            } else

            {
                System.out.println( "****String too short, must be at least 20 characters****" );
            }
        }

        public void replaceChar(String str) {
            hdr = "replaceChar";
            headerMethod(hdr);
            strPhrase = str;
            System.out.println(str);
            System.out.println("^^^^^^^^^Original String^^^^^^^^");
            char[] arryChar = strPhrase.toCharArray();
            for (char temp : arryChar) {
                if ( temp == 'a' ||
                        temp == 'e' ||
                        temp == 'i' ||
                        temp == 'u' ||
                        temp == 'o' ||
                        temp == 'A' ||
                        temp == 'E' ||
                        temp == 'I' ||
                        temp == 'U' ||
                        temp == 'O' ) {
                    temp = '*';
                    System.out.print( temp );
                } else {
                    System.out.print( temp );
                }
            }
        }
        public void replaceStringChar(String str) {
            strPhrase = str;
            hdr = "replaceStringChar";
            headerMethod(hdr);
            System.out.println(str);
            System.out.println("^^^^^^^^^Original String^^^^^^^^");
            char[] arryChar = strPhrase.toCharArray();
            for (char temp : arryChar) {
                if ( temp == 'a' ||
                        temp == 'e' ||
                        temp == 'i' ||
                        temp == 'u' ||
                        temp == 'o' ||
                        temp == 'A' ||
                        temp == 'E' ||
                        temp == 'I' ||
                        temp == 'U' ||
                        temp == 'O' ) {
                    temp = '*';
                    System.out.print( temp );
                } else {
                    System.out.print( temp );
                }
            }
        }

        public void headerMethod (String hdr){
        strHeader = hdr;
        System.out.println("********************************");
        System.out.println("    "+strHeader);
        System.out.println("********************************");
        }
    }


