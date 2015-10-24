/*
 * @author: Mohit Uniyal
 * Problem: replace repeated number with '*' and sort array, so that all '*' comes at last 
 * 			Input : {8, 3, 1, 3, 4, 1, 4}
 * 			Output: {1, 3, 4, 8, *, *, *}			
 */
package set4;

import java.util.Arrays;

public class ReplaceRepWithStar {
	private static void replaceStr(int arr[]){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					arr[j]='*';
				}
			}
		}
		Arrays.sort(arr);
		System.out.print("Output: ");
		ReplaceRepWithStar.displayArr(arr);
	}
	
	public static void displayArr(int arr[]){
		for(int i=0; i<arr.length; i++){
			if('*'!=(char)arr[i])
				System.out.print(arr[i]+", ");
			else
				System.out.print("*, ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//test case 1
		int arr1[] = {1,2,1,3,4,2,4,3,6,7};
		System.out.println("Test case 1");
		System.out.print("Input : ");
		ReplaceRepWithStar.displayArr(arr1);
		ReplaceRepWithStar.replaceStr(arr1);
		
		//test case 2
		int arr2[] = {1,12,3,1,11,5,11,2,6,6,7};
		System.out.println("Test case 2");
		System.out.print("Input : ");	
		ReplaceRepWithStar.displayArr(arr2);
		ReplaceRepWithStar.replaceStr(arr2);
	}
}
