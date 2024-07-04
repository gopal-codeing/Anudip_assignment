public class Bank{
      double amount;
     Bank(double amount){
         this.amount = amount;
     }
     
     void withDraw(double withdrawamount){
         System.out.println(withdrawamount <= amount? "success Fully Withdeaw :"+ withdrawamount +" Your Current amount :"+(amount-=withdrawamount) :  "Sorry you can not Withdeaw your amount is :"+amount);
         
     }
      void depositAmount(double depositeamount){
         amount += depositeamount;
         System.out.println("My Amount is :" + amount);
     }
     
      
     public static void main(String []args){
      Bank obj = new Bank(10000);
      obj.withDraw(50000);
      obj.depositAmount(50000);
     obj.withDraw(50000);
      
     }
}
