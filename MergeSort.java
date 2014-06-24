public class MergeSort{
	

	public static void merge(int[] arr, int low, int middle, int high){


		int[] temp1 = new int[arr.length];
		for(int i=low; i<= high; i++){
			temp1[i] = arr[i];
		}
		
		
		int i = low;
		int j = middle+1;
		int k=low;

		while(i<=middle && j<=high){
			if(temp1[i] <= temp1[j]){
					arr[k]=temp1[i];
					++i;
				}else{
					arr[k]=temp1[j];
					++j;
				}
				++k;
		}
		
		while(i<=middle){
				arr[k]=temp1[i];
				++i;
				++k;
		}
	}

	public static void mergesort(int[] arr, int low, int high){
		if(low<high){
			int middle = low+(high-low)/2;
			//System.out.println("Low: "+low + "Middle :" + middle +"high :"+high);
			mergesort(arr,low,middle);
			mergesort(arr,middle+1,high);
			merge(arr,low,middle,high);
		}
	}

	public static void main(String[] args){
		int[] data = new int[]{6,9,43,8,11,7,12,5};
		
		System.out.println("Before Sorting :");
		for(int i=0; i<data.length; i++){
			System.out.print(data[i] + " ");
		}
		System.out.println();
		int low=0;
		int high= data.length -1;
		mergesort(data,low,high);
		System.out.println("After Sorting :");
		for(int i=0; i<data.length; i++){
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}