/*
 * @author : Mohit Uniyal
 * Problem : Entered n should be repeated n times in an array, n should not be repeated one after another 
 * 			 Input : [1,2,3,4,3,5,3]   Output: true  
 * 			 Input : [1,4,4,5,2,4,6,4] Output: false (there shuould be at least on different element between index 1 and 2)	
 * Solution: used nested for loop to iterate through all elements and avoided index value 
 */
package set3;

class NumEquFreq{
	static boolean checkNum(int arr[], int n){
		boolean flag = false; int count = 0;
		for(int i=0; i<arr.length; i++){
			//use of flag ensures that, two element one after another
			//cannot be same, no continuous repetition 
			if(arr[i]==n){
				count++;
				if(flag) return false;
				flag = true;
			}else{
				flag = false;
			}
		}
		if(count==n) return true;
		else return false; 
	}

	static void displayVal(int arr[], int n){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" num : "+n);
	}
	
	public static void main(String []args){
		//test case 1
		int arr1[] = {3, 9, 3, 5, 7, 3,};
		NumEquFreq.displayVal(arr1, 3);
		System.out.println("Test case 1 : "+NumEquFreq.checkNum(arr1, 3));
		
		//test case 2
		int arr2[] = {4, 4, 5, 4, 4};
		NumEquFreq.displayVal(arr2	, 4);
		System.out.println("Test case 2 : "+NumEquFreq.checkNum(arr2, 4));
	}
}