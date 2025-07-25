//Binary search is widly use algorithm for finding a specific value within a sorted list of an array.it works by repeatedly dividing the search space in half unit the desired value is found
//or determine to be absent.
import java.util.Scanner;
class binary{

    public static int binarySearch(int[] arr,int key){

        int start=0, end=arr.length-1;
        while(start<=end){

            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                start=mid-1;
            }
        }
        return -1;
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

        int found=binarySearch(arr,key);
        System.out.println("key found: "+found);
    }
}
                                                                                                                                                                                                                                                                                                                                                                            