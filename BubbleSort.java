public class BubbleSort{
	public static void bubbleSort(int[] arr){
		int size = arr.length;
		for(int pass=1; pass<size; pass++){
			for(int i=0; i<size-pass; i++){
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}

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
		bubbleSort(data);
		System.out.println("\n After Sorting :");
		for(int i=0; i< size; i++){
			System.out.print(data[i] + " ");
		}
		System.out.println();

	}
}