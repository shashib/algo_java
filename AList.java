import java.util.ArrayList;

public class AList {
	public static void main(String[] args){
		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(100);
		grades.add(98);
		grades.add(63);
		grades.add(87);
		grades.add(45);

		int total =0;

		/*for(int i=0; i<grades.size(); i++){
			total +=grades.get(i);

		}*/

		for (Integer grade: grades){
			total += grade;
		}

		double avg= total/grades.size();

		System.out.println( "Size is : " + grades.size() + "Avg:" + avg );
		grades.remove(4);
		System.out.println("Size is :" + grades.size());


	}
}