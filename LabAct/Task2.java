import java.io.*;
public class Task2 {

    public static void main(String[] args)throws IOException{
        // to read the dummy.txt file 
    try (BufferedReader br = new BufferedReader(new FileReader("dummy.txt"))) {
      String line;
      // initial value of line count for the loop
      int lineNum = 0;
      // while loop for displaying line by line until 5th line
      while ((line = br.readLine()) != null && lineNum < 5) {
        System.out.println(line);
        lineNum++;
      }
      // for Exception errors
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
