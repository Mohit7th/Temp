/*
 * @author : Mohit uniyal
 * Problem : sort array elements in ascending till position 'k-1' and descending after 'k'
 * 			 Input  - {5, 1, 4, 6, 7, 11, 3, 2} and  k = 4
 * 			 Output - {1, 4, 5, 6, 11, 7, 3, 2}	 
 */
package prg;

class SortArr {
	public static void sortKPos(int n1[], int k) {
		int t;
		// sorting elements 0 to k-1
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				if (n1[i] < n1[j]) {
					t = n1[i];
					n1[i] = n1[j];
					n1[j] = t;
				}

			}
		}

		// sorting elements k to length of array
		for (int i = k; i < n1.length; i++) {
			for (int j = k; j < n1.length; j++) {
				if (n1[i] > n1[j]) {
					t = n1[i];
					n1[i] = n1[j];
					n1[j] = t;
				}
			}
		}
	}

	public static void displayArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// test case 1
		int n1[] = { 5, 3, 2, 1, 7, 4, 2, 8, 9, 11, 5 };
		System.out.print("before : ");
		SortArr.displayArr(n1);
		SortArr.sortKPos(n1, 3);
		System.out.print("after  : ");
		SortArr.displayArr(n1);

		// test case 2
		int n2[] = { 1, 6, 2, 8, 5, 9, 11, 12, 3, 0, 3 };
		System.out.print("before : ");
		SortArr.displayArr(n2);
		SortArr.sortKPos(n2, 7);
		System.out.print("after  : ");
		SortArr.displayArr(n2);
	}
}
