import java.io.*;

public class FileCount {
    public static void main(String[] args) {

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        String filename = args.length > 0 ? args[0] : "student.txt";
        System.out.println("Using file: " + filename);

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Characters : " + charCount);
            System.out.println("Words      : " + wordCount);
            System.out.println("Lines      : " + lineCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}