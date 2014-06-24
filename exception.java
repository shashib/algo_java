import java.util.*;
import java.io.*;

public class exception {
	public static void main(String[] args){
		String file=args[0];
		String line ="";
		BufferedReader inFile=null;
		try{
			 inFile= new BufferedReader(new FileReader(file));
			while((line=inFile.readLine()) !=null){
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File not found. Try again");
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally {
			if(inFile != null){
				try{
					inFile.close();
					System.out.println("File Closed");
				}
				catch(IOException e){
					System.out.println("PROBLEMS with FILE");
				}
			}
		}
	}
}