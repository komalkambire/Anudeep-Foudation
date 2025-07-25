import java.util.Scanner;
class grade{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 5 subject marks: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        int total=a+b+c+d+e;
        int per=(total/5);
        System.out.println("Total marks: "+total);
         System.out.println("Percentage: "+per);

        if(per<100 && per>80){
            System.out.println("Grade: A");

        }
        else if(per>=50 && per<80){
            System.out.println("Grade: B");
            
        }
        else
        {
            System.out.println("Grade: C");
        }
        
        
            }

}