import java.util.LinkedList;

public class NameQueue {
	public static void main(String[] args){
		LinkedList<String> names = new LinkedList<String>();
		names.addLast("Shashi");
		names.addLast("Kajal");
		names.addLast("Soham");
		for(String name : names){
			System.out.println(name);
		}

	}
}