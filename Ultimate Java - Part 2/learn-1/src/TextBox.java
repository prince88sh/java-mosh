public class TextBox {
    public String text; //Fields

    public void setText(String text){
        this.text=text;
    }

    public void clear (){
        this.text="";  //if I use text="" then both are same
    }
}
