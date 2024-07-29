/* Online Java Compiler and Editor */
import java.util.*;
   class Number{
       int data;
       Number(int data){
           this.data =data;
       }
   }


public class Ownclass{
     public static void main(String []args){
          ArrayList<Number> obj = new ArrayList();
          obj.add(new Number(10));
          obj.add(new Number(10));
          obj.add(new Number(10));
          obj.add(new Number(10));
          for(Number data : obj)
        System.out.print(data.data+" ");
     }
}
