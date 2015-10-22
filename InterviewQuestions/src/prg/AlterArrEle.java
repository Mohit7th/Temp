/*
 * @author : Mohit Uniyal
 * Problem : Program to sort an array and after sorting display alternative elements
 * 			 Input : {2, 1, 9, 8, 3}
 * 			 Sorted: {1, 2, 3, 8, 9}
 * 	         Output: {1, 3, 9}	
 */

package prg;

class AlterArrEle {

	public static void sort(int n1[]) {
		int t;
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1.length; j++) {
				if (n1[i] < n1[j]) {
					t = n1[i];
					n1[i] = n1[j];
					n1[j] = t;
				}
			}
		}
		System.out.print("Sorted: ");
		AlterArrEle.displayArr(n1);
	}

	public static void displayAlterArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				System.out.print(arr[i] + ", ");
		}
		System.out.println();
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
		System.out.print("Input : ");
		AlterArrEle.displayArr(n1);
		AlterArrEle.sort(n1);
		System.out.print("Output: ");
		AlterArrEle.displayAlterArr(n1);

		// test case 2
		int n2[] = { 1, 6, 2, 8, 5, 9, 11, 12, 3, 0, 3 };
		System.out.print("Input : ");
		AlterArrEle.displayArr(n2);
		AlterArrEle.sort(n2);
		System.out.print("Output: ");
		AlterArrEle.displayAlterArr(n2);
	}
}
