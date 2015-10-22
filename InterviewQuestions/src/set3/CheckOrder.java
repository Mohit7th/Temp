/*
 * @author : Mohit Uniyal
 * Problem : digits of a number should be in increasing order
 * 			 Input: 1345  Output: true  (because 1<3<4<5)
 * 			 Input: 1472  Output: false (because 1<4<7 but 7 is greater than 2)	
 * Solution: first extracted last value, which is compared with second last value and so on  
 */
package set3;

class CheckOrder{	
	static boolean check(int num){
		int rem =0, temp =0; boolean flag= false;
		if(num>=0){
			//single digit number
			if(num<=9) return true;
			//extracting last digit from the number
			rem = num%10; num=num/10;
			while(num>0){
				temp = num%10; num = num/10;
				if(temp<rem) flag = true;
				else return false;
				//now second last digit will be new digit for comparison
				rem=temp;
			}
			if(flag) return true;
			return false;
		}else{
			return false;
		}
	}
	
	public static void main(String []args){
		//test case 1
		System.out.println("Test case 1 : 1378");
		System.out.println("order : "+CheckOrder.check(1));	
		
		//test case 2
		System.out.println("\nTest case 2 : 165");
		System.out.println("order : "+CheckOrder.check(165));
	}
}