class UnderAgeException extends Exception{
    public UnderAgeException(String message){
        super(message);
    }
}
class voterApp{
    public static void checkEligibility(int age) throws UnderAgeException
    {
         if(age<18){
            throw new UnderAgeException("You are not eligible");
         }
         else{
            System.out.println("You are eligible");
         }
    }
       
    public static void main(String arg[]){
        try{
            checkEligibility(11);
        }
        catch(UnderAgeException e){
            System.out.println("Exception: "+e.getMessage());
        }

    }
}