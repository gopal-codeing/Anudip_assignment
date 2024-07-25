import java.util.Scanner;

 class Animal{
  void makeSound(){
    System.out.println("Animal Sound ");
  }
}

class Dog extends Animal{
    void makeSound(){
         System.out.println("The animal sound." + "barks");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("The animal sound." + "meows");
    }
}


/**
 * Forest
 */
public class Forest {
    public static void main(String... jgd){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Animal name Cat or Dog:");
        String name  =obj.nextLine();
        
        switch(name){
            case "Cat":
             new Cat().makeSound();
             break;
             case "Dog":
             new Dog().makeSound();
             break;
             default:
             System.out.println("Sorry i have not a class :");
             break;
        }
    }
}
