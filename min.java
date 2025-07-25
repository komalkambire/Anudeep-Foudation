import java.util.Scanner;
class min{

    public static int getSmallest(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int index=getSmallest(arr);
        if(index==-1){
            System.out.println("invalid key");
        }
        else{
        System.out.println("minimun element : "+index);
        }

    }
}