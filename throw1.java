import java.util.Scanner;
class UnderAgeException extends Exception{
    public UnderAgeException(String message){
        super(message);
    }
}
class OverAgeException extends Exception{
    public OverAgeException(String message){
        super(message);
    }
}
class throw1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        try{
            if(age < 18){
                throw new UnderAgeException("You are not valid for registration");
            }
            else if(age>100){
                throw new OverAgeException("You are not valid for registration");
            }
            else{

                System.out.println("Valid age for Registration");
            }
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }


    }
}