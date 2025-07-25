class excep{
    public static void main(String ags[]){
        try{
            int result=100/100;
            System.out.println("Result is: "+ result);
        }
        catch(ArithmeticException e){
            System.out.println("Result is : "+e);
        }
        finally{
            System.out.println("Block excute sucessfuly");
        }
    }
}