package binarysearch;

public class Definition {
	
	public static int BinarySearch(int []arr, int key) {
		
		int left = 0;
		int right = arr.length - 1; ;
		int mid = 0 ;
		
		while(left <= right) {
			mid = (left + right)/2;
			
			if (arr[mid] == key) {
				return mid;
			}//if mid
			
			if(key < arr[mid]) {
				right = mid - 1;
			}//left
			
			else {
				left = mid + 1;
			}//else
		}//while
		
		return 99999;
		}//binarysearch
	
	public static int binarysearch(int [] arr, int left, int right, int key) {
		if(left > right) {
			return -1;
		}//if wrong
		
		int mid = (left + right)/2;
		
		if(arr[mid] == key) {
			return mid;
		}//if mid
		
		if(key < arr[mid]) {
			return binarysearch(arr , left, mid-1, key);
		}// left
		
			return binarysearch(arr, mid+1 , right, key );
		
	}//recursion

}//class
