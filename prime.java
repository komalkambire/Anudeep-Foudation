import java.util.Scanner;
class prime{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        boolean isPrime=true;

        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
            }

        }
        if(isPrime==true){
                System.out.println("Numver is prime");
            }
            else{
                System.out.println("Numver isnot prime number");
            }
    }
}