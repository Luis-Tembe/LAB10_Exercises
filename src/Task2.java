import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.AutoCloseable;
import java.io.FileWriter;


public class Task2{
    public static void main(String[] args) throws IOException{
        FileInputStream fs = null;
        int bajt;
        try{
            fs = new FileInputStream("Test123.txt");

        }catch (FileNotFoundException ex){
            System.out.println("File not found");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(ClosingFile cf= new ClosingFile();){
            do {
                bajt= fs.read();
                if (bajt != -1) System.out.print((char) bajt);
            } while (bajt != -1);

        } catch(IOException ex){
            System.out.println("Error reading file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class ClosingFile implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("\nclosing the file");
    }
}
