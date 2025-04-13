public class UIControl extends Object{             // this inherit from OBJECT CLASS
    private boolean isEnabled=true;

    public UIControl(boolean isEnabled) {
        this.isEnabled=isEnabled; // adding parameter
        System.out.println("UICONTROL CONSTRUCTOR");
    }

    public void enable(){
        isEnabled=true;
    }

    public void disable(){
        isEnabled=false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
