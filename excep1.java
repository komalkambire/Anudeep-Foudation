import java.util.Scanner;
class excep1{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter nO OF people");
    int people=sc.nextInt();

    try{
        int total=people/0;

    }
    catch(ArithmeticException e){
      System.out.println("please enter valid no of people: "+e);
    }
    finally{
        System.out.println("execute successful");
    }
    
        
    }
}