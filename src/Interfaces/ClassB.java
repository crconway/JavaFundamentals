package Interfaces;

/**
 * Created by crc07 on 4/13/2017.
 */
public class ClassB {

    private String strMessage;

    public String getStrMessage(){
        return strMessage;
    }
    public void setStrMessage(String strMessage){
        this.strMessage = strMessage;

    }
    public void identify(){
        System.out.println("this is class B ...");
    }
}
