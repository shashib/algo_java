public class QuickSort{

	public static void quicksort(int[] arr, int left, int right){
		int i=left;
		int j=right;
		int temp;
		//get the pivor element
		int pivot=arr[(left+right)/2];
		//divide in two list
		while(i<=j){
			// If the current value from the left list is smaller then the pivot
      // element then get the next element from the left list
			while(arr[i]<pivot)
				i++;
			// If the current value from the right list is larger then the pivot
      // element then get the next element from the right list
			while(arr[j]>pivot)
				j--;
			// If we have found a values in the left list which is larger then
      // the pivot element and if we have found a value in the right list
      // which is smaller then the pivot element then we exchange the
      // values.
      // As we are done we can increase i and j
			if(i<=j){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				--j;
			}
		}
		//recursion
		if(left<j)
			quicksort(arr,left,j);
		if(i<right)
			quicksort(arr,i,right);
	}

	public static void Display(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		int[] data = new int[]{5,10,1,9,4,8,3,6,2,7};
		System.out.println("Unsorted Array :");
		Display(data);
		quicksort(data,0,data.length-1);
		System.out.println("Sorted Array :");
		Display(data);
	}
}