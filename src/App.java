import java.util.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       final int monthlyOfYear = 12;
       int principal;
       double r_interestRate;
       int yrs;

       while(true){
       System.out.print("Enter Principal  ( 1k to 1m): ");
       principal = scan.nextInt();
       if(principal < 1000 || principal > 1000000){
         System.out.println("Please enter greater than 1k or less than 1m ");
          continue;
       }
       else{
         break;
       }

       }
       while(true){
       System.out.print("Annual interest rate : ");
       r_interestRate = scan.nextDouble();
      
       if(r_interestRate <= 0){
         System.out.println("Please enter greater than > 0 or less than < 30 ");
         continue;
       }
       else {
       break;
       }
       }
       while(true){
       System.out.print("Period (years) : ");
       yrs = scan.nextInt();
       if(yrs <= 0){
        System.out.println("Please enter greater > 0 or less than < 30");
        continue;
       }
       else{
        break;
       }
       }

       double monthlyInterest = r_interestRate / 100 / monthlyOfYear;
       int NumsOfPayments = yrs * monthlyOfYear;
       double Mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, NumsOfPayments) )
       /( Math.pow(1 +monthlyInterest , NumsOfPayments)- 1);
       String MortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
       System.out.println("Mortgage : " + MortgageFormatted);
    }
}
