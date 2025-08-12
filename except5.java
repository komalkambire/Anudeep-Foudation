import java.util.Scanner;
class except5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an array");
         int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        try{
            System.out.println(arr[10]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("run successfully");
        }

    }
}