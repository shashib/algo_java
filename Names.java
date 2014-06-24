import java.util.HashSet;

public class Names {
	public static void main(String[] args){
		HashSet<String> names = new HashSet<String>();
		names.add("David");
		names.add("item2");
		names.add("item3");

		System.out.println("total number of names are " + names.size());
		names.add("item4");
		System.out.println("Now total number of names are " + names.size());

		for(String name: names){
			System.out.println (name);
		}

		names.remove("David");
		names.add("item1");
		if(names.contains("David")){
			System.out.println("Found David");
		}else{
			System.out.println("Ops! NO Match.");
		}

		names.clear();
		
	}
}