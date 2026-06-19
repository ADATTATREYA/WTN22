import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        try (
            FileInputStream fis = new FileInputStream("student.txt");
            FileOutputStream fos = new FileOutputStream("backup.txt")
        ) {

            int bytedata;

            while ((bytedata = fis.read()) != -1) {
                fos.write(bytedata);
            }

            System.out.println("File copied successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}