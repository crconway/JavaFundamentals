package methods_encaptulations_conditionals.Homework_week2;

/**
 * Created by crc07 on 3/23/2017.
 */
public class UtilitiesClass {

    private String strHeader;
    private String hdr;
    //public UtilitiesClass(String str){
    //     strPhrase = str;

    public int x;

    public void printNumDivisibleBySeven(int start, int stop) {
        hdr = "printNumDivisibleBySeven";
        headerMethod(hdr);
        System.out.println( start +" - " + stop +" Numbers Divisible by Seven" );
        for (int i = start; i < stop; i++) {
            if ( i % 7 == 0 ) {
                System.out.println( i );
            }
        }

    }
    public int countNumberDivisiblebySeven(int start, int stop){
       int counterD = 0;
        hdr = "countNumberDivisibleBySeven";
        headerMethod(hdr);
        System.out.println( start +" - " + stop +" Numbers Divisible by Seven" );
        for (int i = start; i < stop; i++) {
            if ( i % 7 == 0 )
                counterD++;
            }
            return counterD;
        }

    public void addAllNumbersLoop(int start, int stop) {
        hdr = "addAllNumbersLoop";
        headerMethod(hdr);
        for (int i = start; i < stop; i++) {
                x += i;
            }
            System.out.println( "Sum of adding all numbers from "+start+ " to "+stop +" = " + x );

        }

        public int findStringLength(String str) {
            hdr = "findStringLength";
            headerMethod(hdr);
            String strPhrase = str;
            //System.out.println( "String is : " + strPhrase );
            //System.out.println( "Total number of characters in the string: " + strPhrase.length() );
            return strPhrase.length();

        }

        public void findCharDistribution(String str) {
            int counterA = 0;
            int counterC = 0;
            int counterN = 0;
            hdr = "findCharDistribution";
            headerMethod(hdr);
            String strPhrase = str;
            String str2 = "aeiouAEIOU";
            if ( strPhrase.length() > 20 ) {
                char[] arryChar = strPhrase.toCharArray();
                for (int i = 0; i < arryChar.length; i++) {
                    if(str2.contains(Character.toString(strPhrase.charAt( i )) )){
                        ++counterA;
                    }
                    else if ( !Character.isDigit( arryChar[ i ] ) ) {
                        ++counterC;
                    }
                    else {
                        ++counterN;
                    }

                }
                System.out.println( "Number of Vowels = " + counterA + "\nNumber of Constants = " + counterC + "\nNumber of numbers " + " = " + counterN );
            } else

            {
                System.out.println( "****String too short, must be at least 20 characters****" );
            }
        }

        public void replaceChar(String str) {
            hdr = "replaceChar";
            headerMethod(hdr);
            String strPhrase = str;
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

            hdr = "replaceStringChar";
            headerMethod(hdr);
            System.out.println(str);
            System.out.println("^^^^^^^^^Original String^^^^^^^^");
            String matcher = ".*[aeiouAEIOU].*";

           char[] arryChar = str.toCharArray();
           for (char temp:arryChar) {
               if (Character.toString( temp ).matches( matcher )){
                   temp = '*';
                   System.out.print(temp);
                } else {
                    System.out.print(temp);
                }

        }
    }
        void headerMethod (String hdr){
        strHeader = hdr;
        System.out.println("\n********************************");
        System.out.println("    "+strHeader);
        System.out.println("********************************\n");
        }


}


