import java.util.Scanner;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

       
        try{
            int arr[]={10,30,20,40,50};
             System.out.println("Enter array index: ");
             int index=sc.nextInt();
              System.out.println("array index found at index "+index+" is "+arr[index]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of boud exception raised"+e);
        }


    }
}