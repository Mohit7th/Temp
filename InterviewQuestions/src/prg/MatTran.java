/*
 * @author : Mohit Uniyal 
 * Problem : rotate a matrix 90 degree right and 90 degree left
 * 			 Input - 10 20    output - 30 10	
 * 					 30 40             40 20
 */
package prg;

class MatTran {

	public static int[][] convert(int arr[][], int flag) {
		int temp[][] = new int[arr.length][arr.length];
		if (flag == 0) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					// transpose of a matrix
					temp[j][i] = arr[i][j];
				}
			}
			System.out.println("Transpose\n");
			MatTran.display(temp);
			int t = 0;
			for (int j = 0; j < arr.length; j++) {
				// swap row by row
				t = temp[j][0];
				temp[j][0] = temp[j][arr.length - 1];
				temp[j][arr.length - 1] = t;
			}

		} else {

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					// transpose of a matrix
					temp[j][i] = arr[i][j];
				}
			}
			System.out.println("Transpose\n");
			MatTran.display(temp);
			int t = 0;
			for (int j = 0; j < arr.length; j++) {
				// swap row by row
				t = temp[0][j];
				temp[0][j] = temp[arr.length - 1][j];
				temp[arr.length - 1][j] = t;
			}

		}
		return temp;
	}

	public static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, { 3, 4 } };
		// use case 1
		System.out.println("before conversion\n");
		MatTran.display(arr);
		arr = MatTran.convert(arr, 0);

		System.out.println("90 degree right\n");
		MatTran.display(arr);

		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// use case 2
		System.out.println("before conversion\n");
		MatTran.display(arr1);
		arr1 = MatTran.convert(arr1, 1);

		System.out.println("90 degree left\n");
		MatTran.display(arr1);
	}
}
