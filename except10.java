import java.util.Scanner;
class except10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        try{
            int result=a/b;
            System.out.println(result);

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}