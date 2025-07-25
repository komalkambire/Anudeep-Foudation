import java.util.Scanner;
class array1{
    public static void main(String args[]){

        int marks[]=new int[10];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
          marks[2]=sc.nextInt();
           marks[3]=sc.nextInt();
            marks[4]=sc.nextInt();
            System.out.println("phy= "+marks[0]);
            System.out.println("chemistry= "+marks[1]);
            System.out.println("maths= "+marks[2]);
            System.out.println("java= "+marks[3]);
            System.out.println("science= "+marks[4]);


    }
}