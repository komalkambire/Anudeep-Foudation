import java.util.Scanner;
class Myexception extends Exception{
    public Myexception(String Message){
       super(Message);
    }
}
class except7{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    try{
        if(num<0){
            throw new Myexception("Do not enter negative valaues");

        }
        else{
            System.out.println("valide values");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }

    }
}