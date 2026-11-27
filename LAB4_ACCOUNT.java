package transaction;
public class Account{
   private int accno;
   float balance;
   
   public Account(int accno, float balance){
      this.accno=accno;
      this.balance=balance;
   }
   
   public void deposit(float amt){
      if(amt>0){
         balance+=amt;
         System.out.println("Deposited Amount:"+amt);
      }
      else{
         System.out.println("Amount must be positive");
      }
   }
   
   public void withdraw(float amt){
      if(amt<=0){
         System.out.println("Invalid amount");
      }
      else if(amt>balance){
         System.out.println("Insufficient Balance");
      }
      else{
         balance-=amt;
         System.out.println("Withdrawn Amount:"+amt);
      }
   }
   
   public int getaccno(){
      return accno;
   }
   
   public float getbalance(){
      return balance;
   }
}
