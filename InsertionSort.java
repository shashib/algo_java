public class InsertionSort{


	public static void main(String[] args){
		int size=10;
		int[] data = new int[size];
		for(int i=0; i<size; i++){
			data[i]=(int)(Math.random()*100);
		}
		System.out.println("Before Sorting :");
		for(int i=0; i< size; i++){
			System.out.print(data[i] + " ");
		}
		for(int i=0; i< size; i++){
			int temp = data[i];
			for(int j=i; j>0; --j){
				if(data[j-1] > temp){
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			}
		}
		System.out.println("\n After Sorting :");
		for(int i=0; i< size; i++){
			System.out.print(data[i] + " ");
		}
		System.out.println();

	}
}