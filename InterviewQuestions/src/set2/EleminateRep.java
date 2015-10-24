package set2;

import java.util.HashSet;
import java.util.Set;

public class EleminateRep {

	public static void eliminate(int[] arr){
		Set<Integer> noRepSet = new HashSet<>();
		
		for(int num : arr){
			noRepSet.add(num);
		}
		System.out.println(noRepSet);
	}
	
	private static void displayArr(int[] arr1) {
		
		for(int num : arr1){
			System.out.print(num+", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//test case 1
		int arr1[] = {1,2,5,2,1,6,1,7,1,8};
		System.out.print("Test case 1 : ");
		EleminateRep.displayArr(arr1);
		EleminateRep.eliminate(arr1);
		
		//test case 2
		int arr2[] = {1,5,1,3,7,11,9,9,2,8,9,1,16};
		System.out.print("Test case 2 : ");
		EleminateRep.displayArr(arr2);
		EleminateRep.eliminate(arr2);
	}
}
