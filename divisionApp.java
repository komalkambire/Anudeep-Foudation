import java.util.Scanner;
class divisionApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numerator: ");
        int a=sc.nextInt();
        System.out.println("Enter Denomator");
        int b=sc.nextInt();
        try{
            int result=a/b;
            System.out.println("Result is: "+result);

        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: "+e);

        }
        catch(Exception e1){
             System.out.println("Unexpected Exception: "+e1);

        }
        finally{
            System.out.println("Block excute sucessfuly");
        }

    }
}