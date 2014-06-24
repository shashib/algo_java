public class ArrayDisp {

	static <T> void Display(T[] arr){
		for(int i=0; i<arr.length; i++){
			if(arr[i] !=null){
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args){
		String[] names= new String[10];
		names[0] = "David";
		names[1] = "Shashi";
		names[2] = "Kajal";
		names[3] = "Soham";
		names[4] = "Anand";

		Display(names);

		Integer[] numbers = new Integer[10];
		for(int i=0; i< 10; i++){
			numbers[i] = i*10;
		}
		Display(numbers);
	}
}