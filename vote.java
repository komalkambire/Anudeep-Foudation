import java.util.Scanner;
class vote{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        try{
            if(age<18){
                System.out.println("You are eligible for voting");

            }
            else{
                    System.out.println("You are not eligible for voting");
            }
        }
        catch(UnderAgeException e){
            System.out.println("Uder Age Exception "+e);

        }


    }
}