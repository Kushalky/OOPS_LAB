import transaction.Account;
import reports.transactionReport;

public class TransactionApp{
   public static void main(String[]args){
      Account acc=new Account(101,1000);
      acc.deposit(500);
      acc.withdraw(700);
      
      transactionReport r=new transactionReport();
      r.generatereport(acc);
      System.out.println("Kushal K Y");
      System.out.println("1WN25CS118");
   }
}  
