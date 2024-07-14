class User{
   int id;
   String name;
   User (int id,String name){
     this.id =id;
     this.name = name;
   }
}

class Employee1 extends User{
     double Salary;
      Employee1(int id , String name, double Salary){ 
         super(id, name);
         this.Salary = Salary;
      }
      
     String calculter(){
          Salary *= 12;
          return  "{ name: " +name + "\n" + "Id: " + id + "\n"+ "Salary: " + Salary + " \n}";
     }
}
public class Employee  {

     public static void main(String[] args) {
          Employee1 obj = new Employee1(19, "vinod", 40.20);
          System.out.print(obj.calculter());
     }
}
