import java.util.TreeSet;

public class Alpha{
	public static void main(String[] args){
		TreeSet<String> names = new TreeSet<String>();

		names.add("item4");
		names.add("item300");
		names.add("item99");
		names.add("item26");
		names.add("item41");
		names.add("item3");
		names.add("item1");

		for(String name: names){
			System.out.println(name);
		}

		System.out.println( "Name after item3: " + names.higher("item3"));
	}
}