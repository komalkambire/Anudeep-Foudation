import java.util.Scanner;
class klargest{
     public static int linearSearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
             if(key==arr[i]){
                return i;
        }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your key");
        int key=sc.nextInt();
        int index=linearSearch(arr,key);
        System.out.println(index);

        for(int i=0;i<arr.length;i++){
            if(arr[i]>key){
                System.out.println(arr[i]);
            }
        }

        if(index==-1){
            System.out.println("Invalid input");
        }
        else{
             System.out.println("The value is in the index: "+index);
        }
    }
}