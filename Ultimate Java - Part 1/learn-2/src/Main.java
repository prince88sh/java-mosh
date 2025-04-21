import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------COMPARISON OPERATOR------------");
        int x=1;
        int y=1;
        System.out.println(x==y); //comaprison
        System.out.println(x!=y); //not equal
        System.out.println(x>y); //grater than
        System.out.println(x<y); //less than

        System.out.println("-------------LOGICAL OPERATOR------------");
        int temperature=30;
        boolean isWarm=temperature >20 && temperature<30;
        System.out.println(isWarm);

        boolean hasHighIncome=true;
        boolean hasGoodCredit=true;
        boolean hasCriminalRecord=false;
        boolean isEligible= (hasGoodCredit || hasGoodCredit)&& !hasCriminalRecord;
        System.out.println(isEligible);

        System.out.println("-------------if STATEMENT------------");
        if(temperature>30){
            System.out.println("It's a hot day\n");
            System.out.println("Drink plenty of water");
        }
        else if (temperature>20 )
            System.out.println("It's nice day");
        else
            System.out.println("It's Cold");

        int income=120_000;
        String className=income>100_000?"First":"Economy";
        System.out.println(className);

        System.out.println("-------------SWITCH STATEMENT------------");
       String role="admin";
       switch (role){
           case "admin":
               System.out.println("You're a Admin");
               break;
           case "moderator":
               System.out.println("You're a moderator");
               break;
           default:
               System.out.println("You're a guest");
       }

        System.out.println("-------------FOR EACH LOOP ------------");
       String[] fruits={"apple","Mango","Orange","Papaya"};
       //METHOD 1
//       for(int j=0;i<=fruits.length;j++){
//           System.out.println(fruits[jss]);
//       }

       //METHOD 2
        for (String fruit:fruits)
            System.out.println(fruit);

        System.out.println("-------------EXCERCISE- FIZZBUZZ ------------");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number: ");
        int number=scanner.nextInt();
        if(number%5==0 && number%3==0)
            System.out.println("FIZZBUZZ");
        else if(number%5 ==0){
            System.out.println("FIZZ");
        }
        else if(number%3 ==0)
            System.out.println("BUZZ");
        else System.out.println(number);

        System.out.println("-------------FOR LOOPS ------------");
        for (int z=1;z<=5;z++){
            System.out.print("HELLO\t");
        }

        System.out.println("\n-------------WHILE LOOPS ------------");
        int z=0;
        while(z<=5){
            System.out.print("WORLD \t");
            z++;
        }

        String input= "";
        while(!input.equals("quit")){
            System.out.print("\nInput: ");
            input =scanner.next();
        }

        System.out.println("\n-------------DO-WHILE LOOPS ------------");
        do{
            System.out.print("\nInput: ");
            input =scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;                   // moves control to beginning of the loop
            if (input.equals("quit"))
                break;                     // to come out of the loop
            System.out.println(input);
        }while(!input.equals("quit"));
    }
}