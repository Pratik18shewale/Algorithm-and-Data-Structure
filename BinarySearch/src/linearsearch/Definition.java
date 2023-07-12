package linearsearch;

public class Definition {
	
	public static int LinearSearch(int [] arr, int key) {
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}//if
		}//for
		return -1;
	}//search

}//class
