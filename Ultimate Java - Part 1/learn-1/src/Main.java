import java.awt.*;
import java.awt.geom.QuadCurve2D;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        before you start we as you java code is converted into machine language so inorder to MC which can be run in any OS
        so only need is JDK
        -> to cover into machine language (go to terminal)
            : javac Main.java  //class name
        -> package will be created in byte code to see it run this
            : java Main

        * */

        //variables.......
        // 1. Primitive types (number, characters booleans) we have 8 types
        System.out.println("-------------------------PRIMITIVE TYPE---------------------");
        byte myAge=30;  //identifier
        long viewCount=3_123_456L;
        float price=10.99F;
        char letter='A';
        boolean isEligble=false;
        System.out.println(myAge);

        System.out.println("-------------------------REFERENCE---------------------");
        //2. Reference type (date, mail message)
        // we need to allocate memory
        Date now= new Date();
        System.out.println(now);

        byte x=1;
        byte y=x;
        x=2;
        System.out.println((y));

        Point point1=new Point(1,1);
        Point point2=point1;
        System.out.println(point2);
        point1.x=2;
        System.out.println(point1);
        System.out.println(point2);


        System.out.println("-------------------------STRING-----(It is immmutable)----------------");
        String msg1=new String("HEllo world");  // long way
        String msg2= "HELLO WORLD" +"!!";
        System.out.println(msg1);
        System.out.println(msg2.endsWith("!!"));
        System.out.println(msg2.startsWith("!!"));
        System.out.println(msg2.length());
        System.out.println(msg2.indexOf('O'));
        System.out.println(msg2.indexOf('S'));
        System.out.println(msg2.replace("!!","-->"));  // original string will  not change

        System.out.println("-------------------------ESCAPE SEQUENCE---------------------");
        String msg3="c:\\Windows\\....";
        System.out.println(msg3);
        msg3="c:\nWindows\\....";
        System.out.println(msg3);
        msg3="c:\tWindows\\....";
        System.out.println(msg3);

        System.out.println("-------------------------ARRAYS-------(Always have fixed length)--------------");
        int[] numbers =new int[5]; // to declare an array
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;

        // if you add any number outside bond then it will show exception error
         // to see array we use ARRAY Class
        System.out.println(Arrays.toString(numbers));
        int[] arr1= {1,2,4,5,6,3,2,35,42,3};
        System.out.println(arr1.length);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //multidiemntional array
        int[][] arr2={{1,2,3},{2,4,6}};
        System.out.println(Arrays.deepToString(arr2));

        System.out.println("-------------------------CONSTANTTS---------------------");
        final float PI=3.14F;
        System.out.println(PI);

        System.out.println("-------------------------ARITHEMTIC OPERATION---------------------");
        int a=5,b=9;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);

        System.out.println("-------------------------ORDER OF PRECEDENCE---------------------");
        float m=1.1F;
        float n=m++;  //remember this

        System.out.println(m);
        System.out.println(n);

        n=++m;
        System.out.println(m);
        System.out.println(n);

        System.out.println("-------------------------CASTING---------------------");
        //byte> short>int>long>float>double
        short s=5;
        int v=s+4;   // implicit casting
        System.out.println(v);
        System.out.println((double)s+90);  //explicit casting

        //for string to use casting
        String p="1";
        int g=Integer.parseInt(p);
        System.out.println(g);
        System.out.println(Double.parseDouble(p));

        System.out.println("-------------------------MATH CLASS---------------------");
        int res1=Math.round(1.1F);
        int res2=(int) Math.ceil(1.1D);
        int res3=(int) Math.floor(1.1D);
        int res4=(int) Math.max(3,8);
        double res5=Math.random();
        double res6=Math.random()*100;
        int res7=(int) Math.round(Math.random()*100);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
        System.out.println(res7);

        System.out.println("-------------------------FORMATTING NUMBER---------------------");
        NumberFormat currency =NumberFormat.getCurrencyInstance();//this is way to create a instance of call for Format number
        // you cannot use NumberFormat currency= new NumberFormat();
        //becasue it is a Abstact class
         String res=currency.format(123334456344.67);
        System.out.println(res);

        //for formating number
        NumberFormat percentInstance= NumberFormat.getPercentInstance();
       String re= percentInstance.format(1298.123);
        System.out.println(res1);

        System.out.println(NumberFormat.getCurrencyInstance().format(34.32)); //chaining format

        System.out.println("-------------------------INPUT (SCANNER)---------------------");
        Scanner scanner=new Scanner(System.in);  /// to use in terminal
        System.out.println("Enter Age:");// to remove line use only print
        byte age=scanner.nextByte();
        System.out.println("You're age is  "+ age);

        System.out.print("Enter Full Name:");
        String name1=scanner.next().trim();
        System.out.println("Name is "+name1);




    }
}