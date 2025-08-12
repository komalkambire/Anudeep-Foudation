class except6{
   

       public static void checkAge(int age){
            try{
                if(age<18){
                    throw new ArithmeticException("Not eligible to vote");
                }
                else{
                    System.out.println("eligible for vote");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    
     public static void main(String args[]){
        checkAge(24);

     }
}
