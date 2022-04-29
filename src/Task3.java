import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        int LuisTembe57169;

        try(FileInputStream fs= new FileInputStream("Test123.txt");
            FileOutputStream fos=new FileOutputStream("CopyOfFile.txt")) {

            do {
                LuisTembe57169= fs.read();
                if ((char)LuisTembe57169 == ' ') LuisTembe57169= '_';
                if (LuisTembe57169 != -1) fos.write(LuisTembe57169);
            }while (LuisTembe57169!=-1);

        }catch (IOException e){
            System.out.println("Error!!!");
        }
    }
}
