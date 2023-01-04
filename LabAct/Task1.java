import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        // initial number for the sum
        int sum = 0;

        // to find the location of the text file
        try (BufferedReader data = new BufferedReader(new FileReader("C:\\Users\\Gail\\Documents\\NetBeansProjects\\data.txt"))) {
            String text;
            // 
            while ((text = data.readLine()) != null) {

                // to convert the strings inside the data file to integers to be summed
                sum += Integer.parseInt(text);
                System.out.print(" ");
                System.out.println(sum);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
 

        // File writer - Create a file with the sum of the data.txt file
        try (PrintWriter pw = new PrintWriter(new FileWriter("sum.txt"))) {
            // to write the sum of the numbers to the new sum.txt file created
            pw.println(sum);
            System.out.println("The file Sum has been successfully created");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
