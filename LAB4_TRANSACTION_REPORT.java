package reports;
import transaction.Account;

public class transactionReport{
   public void generatereport(Account account){
      System.out.println("Transaction Report");
      System.out.println("Account Number:"+account.getaccno());
      System.out.println("Current Balance:"+account.getbalance());
   }
} 
