public class Main {
    public static void main(String[] args) {
        System.out.println("--------USE OF METHODS!");
        System.out.println(greetUser("PRINCE","SHARMA"));
        System.out.println(greetUser("MOSH","HAMEDANI"));
    }
    public static String greetUser(String firstName, String lastName){
        return "Hello, "+firstName+" "+ lastName;
    }
}