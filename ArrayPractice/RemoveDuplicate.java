//program to remove duplicate element from an array

import java.util.*;

class RemoveDuplicate{
	
	public static void removeDuplicateUsingSorting(int arr[]){
		Arrays.sort(arr);
		int len=arr.length;
		int j=0;
		//traverse the array
		for(int i=0; i<len-1; i++){
			//if value present in i and i+1 is not equal
			if(arr[i] != arr[i+1]){
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[len-1];
		
		for(int k=0; k<j; k++){
			System.out.print(arr[k] + " ");
		}
	}
	public static void removeDuplicateUsingSet(int arr[]){
		Set<Integer> st=new HashSet<>();
		int len=arr.length;
		
		for(int i=0; i<len-1; i++){
			st.add(arr[i]);
		}
		//print each element
		st.forEach(elem -> System.out.print(elem + " "));
	}
	public static void main(String args[]){
		int arr[] = {5,1,2,6,4,4,5,6,8,7};
		removeDuplicateUsingSorting(arr);
		System.out.println();
		
		removeDuplicateUsingSet(arr);
		System.out.println();
	}
}