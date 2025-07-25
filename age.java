import java.util.Scanner;
class UnderAgeException extends Exception{
    public UnderAgeException(String message){
        super(message);
    }
}
class age{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        try{
            
              System.out.println("Enter your age");
              int age=sc.nextInt();
              if(age<18){
                throw new UnderAgeException("You are not eligible for voting");
              }
              else{
                
                System.out.println("You are eligible for voting");
              }

        }
        catch(UnderAgeException e){
            System.out.println("UnderAgeException are raised"+e);
        }catch(Exception e1){
            System.out.println("Invalid Age"+e1);
        }
    }
}