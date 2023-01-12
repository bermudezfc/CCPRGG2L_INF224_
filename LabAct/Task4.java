import java.io.*;
import java.util.*;

public class Task4 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
                // Scanner declaration
		Scanner scan = new Scanner(System.in);
		
                // User input of chosen file name
		System.out.print("Enter file name: "); 
		String fileName = scan.next();
                
                   
                // File path/directory
		File inputFile = new File("C:\\Users\\Gail\\Documents\\NetBeansProjects\\Programming2Activity\\dummy.txt"); 
		String[] words = null;
                // Initial value for word count
		int wordCounter = 0;
		FileReader fr = new FileReader(inputFile);
		BufferedReader br = new BufferedReader(fr);
		String w;
		
		try {
			while((w = br.readLine())!= null) {
			words = w.split(" ");
                            wordCounter = wordCounter + words.length;
		}
		fr.close();
		System.out.println("Word count for this file: "+wordCounter);
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
                }

		}
	
	}

