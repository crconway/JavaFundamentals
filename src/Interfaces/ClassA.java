package Interfaces;

/**
 * Created by crc07 on 4/13/2017.
 */
public class ClassA extends ClassB implements InterA{

    private String strMessage;

    public String getStrMessage(){
        return strMessage;
    }
    public void setStrMessage(String strMessage){
        this.strMessage = strMessage;

    }
    public void identifyClasses(){
        System.out.println("this is class A ...");
        identify();  //through extension of ClassB from ClassA
    }
    public void returnMessage(){
        System.out.println("this is ClassA implementing an abstract Method from main");
    }
}
