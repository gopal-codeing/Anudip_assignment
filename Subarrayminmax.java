class Subarrayminmax{
    public static void main(String yo[]){
        int arr[] = {2,4,5, 3, 6, 7, 9, 4, 5, 6};
        Scanner sc= new Scanner(System.in);
        System.out.print("Entre the number two size between 0 to arr of size :");
        int num1 =  sc.nextInt();
        int num2 =  sc.nextInt();
        int max = arr[num1];
        for(int i= num1; i <=num2; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        int secondmin = arr[num1];
        for(int i=num1; i<=num2; i++) {
            if(arr[i] < max && arr[i] > secondmin )
                secondmin = arr[i];
        }
        for(int i=num1; i<=num2; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
        System.out.print("Second max : "+secondmin);
    }
}
