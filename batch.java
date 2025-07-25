import java.util.Scanner;
class batch
{
    public static void main(String args[]){
        try{
             Scanner sc=new Scanner(System.in);
            for(int i=1;i<=5;i++){
             
            System.out.println("Enter first number: ");
            int num1=sc.nextInt();
            System.out.println("Enter second number: ");
            int num2=sc.nextInt();

            if(num2==0){
                 System.out.println("Error division by zero is not allowed ");
            }
            else
            {
                int result=num1/num2;
                 System.out.println("Result is: "+result);
            }
            }
                   
        }
        catch(ArithmeticException e){
            System.out.println("Not divisible by 0");
        }
        
    }
}