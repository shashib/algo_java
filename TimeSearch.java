public class TimeSearch{
	
		public static int min(int[] arr){
			int mininum=arr[0];
			for(int i=0; i<arr.length;i++){
				if(arr[i]<mininum){
					mininum=arr[i];
				}
			}
			return mininum;
		}
		public static void main(String[] args){
			int[] data = new int[]{5,10,1,9,4,8,3,6,2,7};
			System.out.println("Unsorted Array :");
			
			//quicksort(data,0,data.length-1);
			System.out.println("Min :" + min(data));
			
		}
	
}