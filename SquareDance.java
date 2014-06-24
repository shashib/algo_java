import java.util.PriorityQueue;
import java.io.*;

public class SquareDance {
	public static void main(String[] args){
		PriorityQueue<String> men = new PriorityQueue<String>();
		PriorityQueue<String> women = new PriorityQueue<String>();
		String line = null;
		String file = "/Users/shashi/codes/java/algo_java/SD_input.txt";
		String sex = "";

		BufferedReader input;
		try{
			System.out.println(file);
			input = new BufferedReader(new FileReader(file));
			while((line=input.readLine()) !=null){
				sex=line.substring(0,1);
				if(sex.equals("M")){
					men.add(line.substring(2));
				}else {
					women.add(line.substring(2));
				}
			}
			input.close();
		}
		catch(IOException except){
			System.out.println("Error Openeing file");
		}
		System.out.println("test2");
		
		while(!men.isEmpty() && !women.isEmpty()){
			System.out.println("The dance party will be :");
			System.out.println(men.poll() + " and " + women.poll());
		}
		
		System.out.println("test1");
		
		if(men.isEmpty() && !women.isEmpty()){
			System.out.println("There is/are "+ women.size() + " women waiting to dance");
			System.out.println((women.peek()) + " is the next women");
		}
		
	}
}