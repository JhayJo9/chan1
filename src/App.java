import java.util.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       int monthlyOfYear = 12;
       int principal;
       double r_interestRate;
       int yrs;
    
       System.out.print("Enter Principal : ");
       principal = scan.nextInt();

       System.out.print("Annual interest rate : ");
       r_interestRate = scan.nextDouble();
       double monthlyInterest = r_interestRate / 100 / monthlyOfYear;
       System.out.print("Period (years) : ");
       yrs = scan.nextInt();
       int NumsOfPayments = yrs * monthlyOfYear;
       double Mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, NumsOfPayments) )
       /( Math.pow(1 +monthlyInterest , NumsOfPayments)- 1);
       System.out.println("Mortgage : " + Mortgage);
    }
}
