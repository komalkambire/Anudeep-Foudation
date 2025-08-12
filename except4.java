class except4{
    public static void main(String args[]){

        try{
            int a[]={2,3,4,5,6};
            int c=10;
            int b=0;

            int result=c/b;

            System.out.println(a[8]);

        }
        catch(ArithmeticException e){
            System.out.println("Can not divide by zero: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("please ente valid size of of an element : "+e1);

        }
        catch(Exception e2){
            System.out.println(e2);
        }
    }
}