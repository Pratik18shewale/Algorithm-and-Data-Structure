package linearsearch;
import static linearsearch.Definition.*;
public class Tester {

	public static void main(String[] args) {
		
		int [] arr = {25, 30, 35, 40, 50, 70};
		
		System.out.println(LinearSearch(arr, 25));
		
		System.out.println(LinearSearch(arr, 35));
		
		System.out.println(LinearSearch(arr, 70));
		
		System.out.println(LinearSearch(arr, 55));
		
		System.out.println();

	}

}
