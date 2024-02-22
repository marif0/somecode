//program to find duplicate in array using set data structure

import java.util.HashSet;
import java.util.Set;

class DuplicateElementSet{
	public static void main(String args[]){
		int arr[]={1,5,4,2,1,4,7};
		Set<Integer> uniqueNumber = new HashSet<>();
		boolean isDuplicateExist = false;
		for(int i=0; i<arr.length; i++){
			if(uniqueNumber.contains(arr[i])){
				isDuplicateExist = true;
				System.out.println("Duplicate number: "+arr[i]);
			}else{
				uniqueNumber.add(arr[i]);
			}	
		}
		if(!isDuplicateExist){
			System.out.println(-1);
		}
	}
}


//set is an unordered collection of objects in which duplicate values cannot be stored
//set is an interface and it is implemented by hashset, linkedhashset or treeset class