import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteClass {
    public static void main(String[] args){
        String filename = args.length > 0 ? args[0] : "src/student.txt";
        File out = new File(filename);
        File parent = out.getParentFile();
        if (parent != null && !parent.exists()) {
            parent.mkdirs();
        }

        try (FileWriter fw = new FileWriter(out)) {
            fw.write("raja is learning java\n");
            fw.write("day1 : interface done");
            System.out.println("File written successfully: " + out.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}