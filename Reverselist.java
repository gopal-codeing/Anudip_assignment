import java.util.*;

public class Reverselist {
    public static void main(String... org) {
        // create a ArrayList class
        ArrayList<Integer> obj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // insert data in the arrayList
        System.out.println("Enter the size :");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value :");
            int name = sc.nextInt();
            obj.add(name);
        }
        // Use Collections interface function and reverse List
        // Collections.reverse(obj);

        // System.out.println(obj);

        /*---------------this is a own my Logic.-------------*/

        int arr[] = new int[obj.size()];
        int count =0;
         for(int val : obj){
            arr[count++]= val;
         }
        /* -----------------Logic-------------- */
        for(int i=0; i<arr.length/2; i++){
                    int tem = arr[i];
                    arr[i] = arr[arr.length - i - 1];
                    arr[arr.length - i- 1] = tem;
                }

        /*-------------- Result----------------*/
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

//     int arr[]= {1,2,3};
//     for(int i=0; i<arr.length/2; i++){
//         int tem = arr[i];
//         arr[i] = arr[arr.length - i - 1];
//         arr[arr.length - i- 1] = tem;
//     }

// for(int i=0 ;i<arr.length ;i++){
//     System.out.print(arr[i]+" ");
// }
    }
}
