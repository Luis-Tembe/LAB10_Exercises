import java.io.*;
import java.io.FileReader;

public class DataManagement{
    String UserName;
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


    void ReadData() throws IOException {
        System.out.println("Please write your first name and last name: ");
        UserName= br.readLine();
    }

    void WriteToFile(){
        try( BufferedWriter bw = new BufferedWriter(new FileWriter("Task4.txt"))) {
            bw.write(UserName+"\n");


        }catch (IOException e){
            System.out.println("An error occurred");
        }

    }
    void ReadFromFile() {
        try(BufferedReader br= new BufferedReader(new FileReader("Task4.txt"))){
            while ((UserName = br.readLine()) != null){
                System.out.println(UserName);
            }

        }catch (IOException e) {
            System.out.println("An error occurent while reading the file");
            e.printStackTrace();
        }


    }
}
