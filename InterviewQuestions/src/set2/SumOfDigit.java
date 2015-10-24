/*
 * @author : Mohit Uniyal
 * Problem : Find sum of digits of a number
 * 			 Input : 123
 * 			 Output: 6
 * solution: getting mod of number by 10 (last digit) and then dividing by 10 (removing last digit of number)
 */
package set2;

public class SumOfDigit {

	public static void addDigit(int num){
		int sum = 0;
		while(num>0){
			sum += (num%10);
			num = num /10;
		}
		System.out.println("sum : "+sum);
	}
	
	public static void main(String[] args) {
		//test case 1
		System.out.println("Test case 1 : 125");
		SumOfDigit.addDigit(125);
		
		//test case 2
		System.out.println("Test case 2 : 1372");
		SumOfDigit.addDigit(1372);
	}

}
