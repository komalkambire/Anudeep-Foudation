import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
class bank{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter amount");
        try{
            int bal=5000;
              System.out.println("Enter amount");
              int amount=sc.nextInt();
              if(amount>bal){
                throw new InsufficientBalanceException("Insufficent balance please enter correct amount");
              }
              else{
                int result=bal-amount;
                System.out.println("Remaining balance: "+result);
              }

        }catch(InsufficientBalanceException e){
            System.out.println("Insufficent balance");
        }

    }
}