class Subarrayminmax{
    public static void main(String yo[]){
        int arr[] ={2,4,5, 3, 6, 7, 9, 4, 5, 6};
      int max = arr[2];
        for(int i= 2;i <=6 ;i++){
            if(arr[i] > max)
              max = arr[i];
        }
        int secondmin = arr[2];
        for(int i=2;i<=6;i++){
            if(arr[i] < max && arr[i] > secondmin )
              secondmin = arr[i];
        }
        for(int i=2;i<=6;i++)
            System.out.print(arr[i] + " ");
        
       System.out.println();
        System.out.print("Second max : "+secondmin);
    }
}