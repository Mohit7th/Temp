/*
 * @author : Mohit Uniyal
 * Problem : Multiply all the digits of a number except digit at current index
 * 			 Input : [1,2,3,4]  
 * 			 Output: 24, 12, 8, 6	
 * Solution: used nested for loop to iterate through all elements and avoided index value 
 */
package set3;

class MultiAvdIndx{
	static void performMul(int arr[]){
		int mulRes = 1;
		System.out.println();
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				//avoiding index value multiplication
				if(i!=j) mulRes *= arr[j];
			}
			System.out.print(mulRes+", ");
			mulRes = 1;
		}
	}	

	static void displayVal(int arr[]){
		System.out.print("[");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
	
	public static void main(String []args){
		//test case 1
		int arr1[] = {1, 2, 3, 4};
		System.out.print("Test case 1 ");
		MultiAvdIndx.displayVal(arr1);
		MultiAvdIndx.performMul(arr1);	
		
		//test case 2
		int arr2[] = {4, 2, 4, 6, 5, 1};
		System.out.print("\nTest case 2 ");
		MultiAvdIndx.displayVal(arr2);
		MultiAvdIndx.performMul(arr2);
	}
}