import java.util.*;

class Area extends Exception{
    Area(String name){
        System.out.println(name);
    }
}


class MyException{
    
    static void function(int value1, int value2){
        if(value1 < 0){
            new Area("Sorry your langth is negative");
        } else if(value2 < 0){
            new Area("Sorry your width is negative");
        }
        else{
            System.out.println(value1 * value2);
        }
    }


     public static void main(String... jgd) {
        System.out.println("Enter the two number :");
        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
         try{
             function(value1,value2);
        }catch(Exception e){
              System.out.println(e);
            }
     }
}
