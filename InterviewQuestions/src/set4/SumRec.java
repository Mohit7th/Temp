/*
 * @author: Mohit Uniyal
 * Problem: add digits of a number using recursion
 * 			Input: 123 Output: 6			
 */
package set4;

public class SumRec {
	private static int addDigits(int num){
		int sum = 0;
		if(num==0){
			return num;
		}else{
			sum +=(num%10)+addDigits(num=num/10);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		//test case 1
		System.out.println("Test case 1 : 124");
		System.out.println("Output : "+SumRec.addDigits(124));
		
		//test case 2
		System.out.println("Test case 1 : 12467");
		System.out.println("Output : "+SumRec.addDigits(12467));
	}

}
