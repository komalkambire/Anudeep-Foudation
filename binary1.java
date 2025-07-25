import java.util.Scanner;
class binary1{
public static boolean binarySearch(int[] arr,int key){

        int start=0, end=arr.length-1;
        while(start<=end){

            int mid=(start+end)/2;
            if(arr[mid]==key){
                return true;
                
            }else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                start=mid-1;
            }
            
        }
        return false;
        
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Enter the num");
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key");
        int key=sc.nextInt();

        boolean found=binarySearch(arr,key);
        System.out.println(found);
    }

}