class array3{

    public static void even(int number[]){
           int evencount=0;
           int oddcount=0;
        for(int i=0;i<number.length;i++){
            if(number[i]%2==0){
                
                
                System.out.println("even number="+number[i]);
               evencount++;
            }
            else

            {
                
                System.out.println("odd number="+number[i]);
               oddcount++;
            }

        }
       System.out.println("Even count= "+evencount);
        System.out.println("odd count= "+oddcount);
       

    }

    public static void main(String args[]){

        int number[]={4,7,2,9,6};
     

        even(number);

         
    }
}