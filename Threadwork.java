// write a program to create four threads each for displaying first 20 even natural number, square of first 20 odd natural , cube of first 20 even natural number and first 20 multiples of 10

class EevenThread extends Thread{
   public void run(){
        System.out.println("Even number ");
        for(int i=1;i<=10;i++){
            if(i%2 ==0)
          System.out.println(2*i);
    }
    System.out.println("-----------------------------");
  }
}

class SquareThread extends Thread{
    public void run(){
        System.out.println("square of the number ");
        for(int i=1;i<=20;i++){
      System.out.println(i*i);
    }
    System.out.println("-----------------------------");

    }
}

class CubeThread extends Thread{
    public void run(){
        System.out.println("Cube of the number :");
        for(int i=1 ;i <= 20 ;i++){
        System.out.println(i*i*i);
     }
     System.out.println("-----------------------------");

    }
}
 
class Threadwork{
    public static void main(String... org){
        // this is a EevenThread class object 
        EevenThread evenobj =  new EevenThread();
         // this is a SquareThread class object 
        SquareThread sqrobj = new SquareThread();
         // this is a SquareThread class object 
        CubeThread   cubeobj = new CubeThread();

    //  every class of object call into the run method
        evenobj.start();
        sqrobj.start();
        cubeobj.start();
    }
}

