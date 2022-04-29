import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task1 {
    public static void main(String[] args) throws IOException{
        FileInputStream fs;
        int bajt;
       try{
           fs = new FileInputStream("Test123.txt");


       }catch (FileNotFoundException ex){
           System.out.println("File not found");
           return;
       }

       try{
           do {
               bajt= fs.read();
               if (bajt != -1) System.out.print((char) bajt);
           } while (bajt != -1);

       }catch(IOException ex){
           System.out.println("Error reading file");
       } finally {
           try{
               fs.close();

           }catch (IOException ex){
               System.out.println("Error closing file");
           }
       }

    }
}
