/*
 * @author: Mohit Uniyal
 * Problem: Program to reverse a number using recursion
 * 			Input : 218
 * 			Output: 812
 */
package set2;

public class NumRevRec {
	static int rev=0;
	private static int numReverse(int num){
		
		if(num<10){
			rev=rev*10+num;
		}else{
			rev=rev*10+(num%10);
			num=numReverse(num/10);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		//test case 1
		System.out.println("Test case 1 : 124");
		System.out.println(NumRevRec.numReverse(124));
		
		//test case 2
		System.out.println("Test case 2 : 12562");
		System.out.println(NumRevRec.numReverse(12562));
	}

}
