class file2{
     public static void main(String aegs[]){
       File file=new File("data.txt");
       
             Scanner sc=null;
        try{

            sc =new Scanner(file);
             System.out.println("File are found");
             while(sc.hasNextLine)
        }
        catch(FileNotFoundException e){
            System.out.println("File not found"+e);
        }
        finally{
            System.out.println("Program run successfuly");
        }
    }
}