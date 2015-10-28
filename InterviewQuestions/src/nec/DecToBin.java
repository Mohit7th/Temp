/*
 * @author : Mohit Uniyal
 * Problem : Convert a decimal number into its binary equivalent
 *			 Input : 2
 *			 Output: 10 (00000010) binary	
 */

package nec;

public class DecToBin {

	public static void main(String[] args) {
		//test case 1
		System.out.print("Decimal 7 -> Binary ");
		DecToBin.convertToBin(7); //binary : 111
		
		//test case 2
		System.out.print("Decimal 12 -> Binary ");
		DecToBin.convertToBin(12); //binary : 1100
	}

	private static void convertToBin(int num) {
		String binStr = "";
		while(num>0){
			binStr += num % 2;
			num = num >> 1;
		}
		//string class do not provide method to reverse a string
		//so we are using StringBuffer reverse method
		binStr = new StringBuffer(binStr).reverse().toString();
		System.out.println(binStr);
	}
}
