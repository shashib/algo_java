import java.util.TreeMap;

public class Numbers{
	public static void main(String[] args){
		TreeMap<String, String> numbers = new TreeMap<String, String>();
		numbers.put("item1", "0001");
		numbers.put("item2", "0002");
		numbers.put("item3", "0003");
		System.out.println("Item1 extenion is " +numbers.get("item1"));
	}
}