import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

class file{
    public static void main(String aegs[]){
        FileReader reader=null;
        try{
            File f=new File("data.txt");
            reader =new FileReader(f);
             System.out.println("File are found");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found"+e);
        }
        finally{
            System.out.println("Program run successfuly");
        }
    }
}