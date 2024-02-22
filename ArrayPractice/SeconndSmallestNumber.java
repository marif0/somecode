//find second smallest number in array

class SeconndSmallestNumber{
	
	public static int getSecondSmallest(int arr[]){
		//Integer.MAX_VALUE = 2147483647
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i] < smallest){
				smallest = arr[i];
			}
			if(arr[i] > smallest && arr[i] < secondSmallest){
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}
	
	public static void main(String args[]){
		int arr[] = {-1,7,1,34,18,78};
		
		//method call
		int result = getSecondSmallest(arr);
		System.out.println("Second Smallest Number: "+ result);
	}
	
}
