import com.sun.tools.jconsole.JConsoleContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------INHERITANCE----------------------");
        var control=new UIControl();
        control.disable();
        System.out.println(control.isEnabled());

        // here UI is inheritated UIControl classdsw
        var control1=new TextBox();
        System.out.println(control1.isEnabled());

        //remember:  Every class we declare directly or indirectly then it basically inherit from the OBJECT CLASS
        var box1=new TextBox();
        var box2=box1;
        System.out.println(box1.hashCode()); // this is calculated based on the address of the object in the memory
        System.out.println(box2.hashCode());
        System.out.println(box1.equals(box2)); // this method we check method for equality
        System.out.println(box1.toString());   // string representation of the Object in two parts
           //1. Fully qualified name of the`class which contains package where it originates from
           //2. it contains the hashcode in hexadecimals
           // together it seen as  Eg. TextBox@1b28cdfa

    }
}