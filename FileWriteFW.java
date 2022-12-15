package FileHandling;

import java.io.*;
 public class FileWriteFW {
     public static void main(String[]args) throws IOException, FileNotFoundException{
         File outFile = new File("output.txt");
         FileWriter fw = new FileWriter(outFile, true);
         
         try{
             fw.write("This is the first line.");
             fw.write("\nThis is the second Line");
         }
         catch(Exception e){
             System.out.println("Error has occured when writing file: " + e.getMessage());
         }
         finally{
             fw.flush();
             fw.close();
         }
         }
         }
 