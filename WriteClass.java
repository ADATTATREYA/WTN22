import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class WriteClass {
    public static void main(String[] args){
        try(FileWriter fw=new FileWriter("src/student.txt")){
            fw.write("raja is learning java\n");
            fw.write("day1 : interface done");
            System.out.println("file writeen sucessfully");
        }
        catch(IOException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}