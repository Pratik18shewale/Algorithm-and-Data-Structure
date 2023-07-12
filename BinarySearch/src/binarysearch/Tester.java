package binarysearch;
import static binarysearch.Definition.*;

public class Tester {

	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.println(BinarySearch(arr, 10));
		System.out.println(BinarySearch(arr, 50));
		System.out.println(BinarySearch(arr, 100));
		System.out.println(BinarySearch(arr, 35));
		
		System.out.println();
		
		System.out.println(binarysearch(arr,0,arr.length-1,10));
		System.out.println(binarysearch(arr,0,arr.length-1,50));
		System.out.println(binarysearch(arr,0,arr.length-1,100));
		System.out.println(binarysearch(arr,0,arr.length-1,55));
		
		System.out.println();
		
		

	}

}
