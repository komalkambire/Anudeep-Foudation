class except2{
    public static void main(String args[]){
        try{
            int num=10;
            int deno=0;
            int result=num/deno;
            }
            catch(ArithmeticException e){
                System.out.println("Enter valid deniminator: "+e);
            }
        }
    
}