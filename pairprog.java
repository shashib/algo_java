public class pairprog{
	public static void main(String[] args){
		pair<String, Integer> grade1 = new pair<String, Integer> ("William", 90);
		pair<String, Integer> grade2 = new pair<String, Integer> ("Brown", 44);

		System.out.println(grade1.first());
		System.out.println(grade2.second());
	}
}