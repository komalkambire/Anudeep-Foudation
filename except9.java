import java.util.*;
class except9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter any integer");
             int num=sc.nextInt();
            System.out.println(num);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
    }

}