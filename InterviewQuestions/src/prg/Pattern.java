/*
 * @author : Mohit Uniyal 
 * Problem : print the pattern 
 * 			 1
 * 			 2*3
 * 			 4*5*6
 * 			 7*8*9*10
 * 			 7*8*9*10
 * 			 4*5*6
 * 			 2*3
 * 			 1	
 */
package prg;

class Pattern {
	public static void main(String[] args) {
		Pattern.displayPattern();
	}

	public static void displayPattern() {
		int k = 1;
		int arr[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++, k++) {
				System.out.print(k);
				if (j + 1 <= i)
					System.out.print("*");
				// storing pattern in array
				arr[i][j] = k;
			}
			System.out.println();
		}
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j < 4; j++) {
				// only printing pattern avoiding zeros
				if (arr[i][j] != 0)
					System.out.print(arr[i][j]);
				if (j + 1 <= i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}