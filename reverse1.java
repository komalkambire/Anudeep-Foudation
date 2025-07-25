 import java.util.Scanner;
class reverse1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
    
        int rev=0;
       for(int i=0;i<=num;i++){
             int lastDigit=num%10;
             rev=rev*10+lastDigit;
             num/=10;

       }
       
      System.out.println(rev);

       
    }
}
