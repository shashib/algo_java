public class time{

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
		int size=100000000;
		int[] data = new int[size];
		int[] data1 = new int[size];
		for(int i=0; i<size; i++){
			data[i]=(int)(Math.random()*100);
			data1[i] =data[i];
		}

		long startTime =System.nanoTime();
		//bubbleSort(data);
		long stopTime=System.nanoTime();
		long duration = stopTime-startTime;

		long startTime1 =System.nanoTime();
		quicksort(data1,0,size-1);
		long stopTime1=System.nanoTime();
		long duration1 = stopTime1-startTime1;
		System.out.println("bubbleSort time :" +duration/1000000 +" quicksort :" +duration1/1000000);
		
	}
}