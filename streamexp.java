import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;


class streamexp

{ 
  public static void main(String[] args) throws IOException,FileNotFoundException
  {
    try{
       File f=new File("file.txt");
       FileReader ob=new FileReader(f);
       char []ch=new char[(int) f.length()];
       ob.read(ch);
       File out= new File("file2.txt");
       FileWriter w=new FileWriter(out);
       w.write(ch);
       w.flush();
       System.out.println("successfull");
     }
     catch(FileNotFoundException e)
     {
       System.out.println("file not available");
     }      
     catch(IOException e)
     {
       System.out.println("some io exception");
     }

     finally
     {
       System.out.println("program executed");
     } 
  }
 } 
        
