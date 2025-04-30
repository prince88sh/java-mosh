public class TextBox extends UIControl{
    private String text="";
    public TextBox(){
        // here we get comvolution error if we add the constructor parameter to base class UICONTROL
        super(true);  // so here we need to pass the parameter
        System.out.println("TEXTBOX CONSTRUCTOR");
    }

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        text="";
    }
}
