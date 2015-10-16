/*
 * @author : Mohit Uniyal
 * Problem : Program to calculate greatest common divisor of two number
 * 			 Input  : 4, 8
 * 			 Output : 4
 */

package prg;

class GcdTwoNum{
	
	public static void calGCD(int n1, int n2){
		int max = 0;
		max = (n1>n2) ? n2 : n1;
		for(int i=max; i>0; i--){
			if(n1%i==0 && n2%i==0){
				System.out.println("GCD : "+i);
				break;
			}
		}	
	}

	public static void main(String[] args) {
		
		//use case 1
		int n1 = 126, n2 = 333;
		System.out.println("n1 :"+n1+" n2 :"+n2);
		GcdTwoNum.calGCD(n1, n2);

		//use case 2 
		n1 = 24; n2 = 38;
		System.out.println("n1 :"+n1+" n2 :"+n2);
		GcdTwoNum.calGCD(n1, n2);
	}
}