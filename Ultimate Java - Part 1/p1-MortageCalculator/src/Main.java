import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    final static byte MONTHS = 12;

    public static void main(String[] args) {
        System.out.println("---------------------------Mortgage Calculator-------------");

        double principalAmount=(double) readNumber("Principal Amount ($1K -$1M): ",1000,1_000_100);
        float annualInterestRate=(float) readNumber("Annual Interest Rate: ",1,30);
        int yrs=(int) readNumber("Period (YEARS): ",1,30);

        printMortgage(principalAmount, annualInterestRate, yrs);

        printPaymentSchedule(yrs, principalAmount, annualInterestRate);

    }

    private static void printMortgage(double principalAmount, float annualInterestRate, int yrs) {
        System.out.println("MORTGAGE:\n");
        double mortageAmt=calculateMortgage(principalAmount, annualInterestRate, yrs);
        System.out.println("MONTHLY PAYMENT\n---------------------------\n");
        NumberFormat currencyInstance= NumberFormat.getCurrencyInstance();
        System.out.print("Mortage Amount: "+currencyInstance.format(mortageAmt));
    }

    private static void printPaymentSchedule(int yrs, double principalAmount, float annualInterestRate) {
        System.out.println("\nPAYMENT SCHEDULE\n---------------------------\n");
        double balance=0.0;
        for (short month = 1; month<= yrs *MONTHS_IN_YEAR; month++) {
            balance = calculateBalance(principalAmount, annualInterestRate, yrs, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt,double min, double max){
        Scanner scanner=new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;

            System.out.println("Enter value between "+min+ " and " +max);
        }
        return value;
    }

    public static double calculateMortgage(
            double principalAmount,
            float annualInterestRate,
            int yrs){
        float numberOfPayments = yrs * MONTHS;
        float monthlyInterestRate = annualInterestRate /PERCENT/ MONTHS_IN_YEAR;
        double amt= principalAmount*
                ((monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfPayments))/
                        (Math.pow(1+monthlyInterestRate,numberOfPayments)-1));

        return amt;
    }

    public static double calculateBalance(
            double principalAmount,
            float annualInterestRate,
            int yrs,
            short numberOFPaymentMade){

        float numberOfPayments = yrs * MONTHS;
        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
        double balance= principalAmount
                *(Math.pow(1+monthlyInterestRate,numberOfPayments)-Math.pow(1+monthlyInterestRate,numberOFPaymentMade))
                /(Math.pow(1+monthlyInterestRate,numberOfPayments)-1);
        return balance;

    }
}