class array4{

    public static void large(int number[]){
           int max=number[0];
         //  int max[]=0;
        for(int i=0;i<number.length;i++){
            if(number[i]>max){
                max=number[i];    
                
               
            }
            
        }
        System.out.println("maximum number="+max);
       
    }

    public static void main(String args[]){

        int number[]={97,89,56,70};
        large(number);
     
    }
}