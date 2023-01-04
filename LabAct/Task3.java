import java.io.*;

public class Task3{
	public static void main(String[] args) throws IOException{
            // initial value for vowel count
            int vowels = 0;
            
            // file name and reader
            try (BufferedReader br = new BufferedReader(new FileReader("dummy.txt"))){
                String line;
                int lineCount = 0;
                while ((line = br.readLine()) != null && lineCount < 5) {
                    for (char v : line.toCharArray()){
                        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || 
                            v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U'){
                            vowels++;
                    }
                }
                lineCount++;
                
            }
                
        } catch (IOException e){
            System.out.println("Error");
        }
            System.out.println("The total number of vowels in the file is " + vowels);
}
}
