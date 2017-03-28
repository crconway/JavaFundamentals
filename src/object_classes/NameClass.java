package object_classes;

/**
 * Created by crc07 on 3/22/2017.
 */
public class NameClass {
    public String fname;
    public String lname;

    public NameClass(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    public NameClass(){
        fname = "No";
        lname = "Name";
    }
    public void printName(){
        System.out.println("Name: "+fname+" "+lname);
    }


}
