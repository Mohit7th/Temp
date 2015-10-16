/*
 * @author : Mohit Uniyal
 * Problem : Sort an array according to max frequency of an element
 * 		     Input  - {0, 1, 4, 4, 1, 8, 3, 1}
 * 			 Output - {1, 1, 1, 4, 4, 0, 3, 8}	
 */

package prg;

class ConArr {
	public static void convert(int arr[]) {
		int temp = 0;
		int freq[] = new int[arr.length];

		/*
		 * sorting elements 
		 * Ex- arr{1,1,2,7,7,7,4,3,7,1} into
		 * 	   arr{1,1,1,2,3,4,7,7,7,7}
		 */

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		/*
		 * now calculating frequency of each elements 
		 *    arr{1,1,1,2,3,4,7,7,7,7}
		 * as freq{3,3,3,1,1,1,4,4,4,4}
		 */
		for (int i = 0, k = 0; i < arr.length; i++, k++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					freq[k]++;
			}
		}

		int tArr[] = new int[arr.length];

		/*
		 * sorting elements in a temp array 
		 * arr{1,1,1,2,3,4,7,7,7,7}
		 * tArr{7,7,7,7,1,1,1,2,3,4}
		 */

		for (int i = arr.length, k = 0; i > 0; i--) {
			// i=arr.length, because maximum frequency can be arr.length
			for (int j = 0; j < arr.length; j++) {
				if (freq[j] == i)
					tArr[k++] = arr[j];
			}
		}
		System.out.print("output: ");
		ConArr.display(tArr);
	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("");
	}

	public static void main(String args[]) {
		// use case 1
		int arr[] = { 1, 4, 3, 2, 1 };
		System.out.print("Input : ");
		ConArr.display(arr);
		ConArr.convert(arr);

		// use case 2
		int arr1[] = { 1, 1, 2, 7, 7, 7, 4, 3, 7, 1 };
		System.out.print("Input : ");
		ConArr.display(arr1);
		ConArr.convert(arr1);
	}
}
