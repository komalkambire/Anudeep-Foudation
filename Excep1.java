import java.util.Scanner;
class Excep1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numerator");
        int a=sc.nextInt();
        System.out.println("Enter Denominator");
         int b=sc.nextInt();

         try{
            int result=a/b;
            System.out.println("Result is: "+result);
         }
         catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: "+e);
         }
         catch(Exception  e1){
            System.out.println("unexpected Exception: "+e1);
         }
         finally{
            System.out.println("Execute Sucessfully");
         }

    }
}