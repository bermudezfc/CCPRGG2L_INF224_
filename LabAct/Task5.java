import java.io.*;
import java.util.*;


public class Task5 {
    public static void main(String[] args) throws IOException {
        // Read the input file
        BufferedReader reader = new BufferedReader(new FileReader("dummy.txt"));
        String line;
        Deque<String> words = new ArrayDeque<>();
        while ((line = reader.readLine()) != null) {
            // Split the line into words and add them to the deque
            String[] lineWords = line.split("\\s+");
            for (String word : lineWords) {
                words.addFirst(word);
            }
        }
        reader.close();

        // Write the reversed words to the output file
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        while (!words.isEmpty()) {
            String word = words.pollFirst();
            writer.write(word);
            writer.write(" ");
        }
        writer.close();
    }
}
