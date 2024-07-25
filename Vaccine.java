import java.util.Scanner;

abstract class Covaccine {
      int age;
      int amount;
      String nationality;
      abstract void  firstDose();
      abstract void  secondDose();
      abstract void  successfull();
}

class Dose extends Covaccine{
    Dose(int age,String nationality, int amount){
        this.age = age;
        this.amount = amount;
        this.nationality = nationality;
    }

    boolean flage = false;
    int count; 
     void  firstDose(){
           if(age >= 18 && nationality.equalsIgnoreCase("india")){
               System.out.println("you are Eligible  for  vaccination  :" + amount);
               flage = true;
               count=1;
           } else{
            System.out.println("you are not Eligible  for  vaccination  :");
           }
     }
      void  secondDose(){
            if(flage){
               System.out.println("you are Eligible  for  second Dose vaccination  :");
               count=2;
            }else{
                System.out.println("you are not Eligible  for second Dose vaccination  :");
            }
      }
         
      void  successfull(){
            if(count==2)
             System.out.print("Your vaccination is SuccessFully : ");
      }
} 
public class Vaccine{
    public static void main(String... jdb){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age :");
        int value = sc.nextInt();
        System.out.println("Enter the country:");
        String nationality = sc.next();
        System.out.println("Enter the vaccination  Amount :");
        int amount = sc.nextInt();
        Dose obj = new Dose(value, nationality, amount);
        obj.firstDose();
        obj.secondDose();
        obj.successfull();
    }
} 


