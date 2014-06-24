import java.util.PriorityQueue;

public class Line{
	public static void main(String[] args){
		PriorityQueue<String> line = new PriorityQueue<String>();
		line.add("David");
		line.add("Cynthia");
		line.add("Bryan");
		line.add("Shashi");

		for( String name : line){
			System.out.println(name);
		}

		line.poll();
		for( String name : line){
			System.out.println(name);
		}

	}
}