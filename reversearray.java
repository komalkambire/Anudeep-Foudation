 import java.util.Scanner;
 class reversearray{
    public static void reverse(int arr[]){
        int start=0,end=arr.length-1;
        int temp;
        while(start<end){
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            
            

            start++;
            end--;
           
        }

    }

    public static void main(String args[]){
        
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Enter the num");
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reverse array");
       // int found=reverse(arr);
      //  System.out.println(found);

      reverse(arr);
      for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
      

    }
 }