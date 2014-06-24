import java.util.HashMap;

public class Grade{
	public static void main(String[] args){
		HashMap<String,Integer> grades= new HashMap<String, Integer>();
		grades.put("Smith",98);
		grades.put("Brown", 10);
		grades.put("Shashi", 100);
		if(grades.containsKey("Smith")){
			System.out.println("Smith's Grade "+ grades.get("Smith"));
		}
		
	}
}
