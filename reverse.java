import java.util.Scanner;
class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
             int lastDigit=num%10;
       rev=rev*10+lastDigit;
       num/=10;

        }
        System.out.print(rev);

       
    }
}