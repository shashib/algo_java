public class ListDriver{
	public static void main(String[] args){
		List<String> glist = new List<String>(10);
		glist.add("milk");
		glist.add("eggs");
		System.out.println("Grocery list :" + glist.toString());

		List<Integer> numbers = new List<Integer>(7);
		numbers.add(2);
		numbers.add(4);
		numbers.add(19);

		List<String> names = new List<String>(3);
		names.add("Shashi");
		names.add("Kajal");
		names.add("Soham");

		System.out.println("Numbers are :" + numbers.toString());
		System.out.println("Names are :" + names.toString());
	}
}