/*
 * @author : Mohit Uniyal
 * Problem : Find sum of numeric values from a string
 * 			 Input : "5 multiplied by 5 is 25"
 * 			 Output: sum = 35
 * Solution: Extracted numbers and stored them in array.  
 */
package set3;

class AddNumOnly{
	static void add(String str){
		int sum = 0, j=0, strLen = str.length(); 
		int numArr[] = new int[strLen];
		char tempCh; 
		boolean flag = false;
		
		//in this loop sum is used as a temp variable
		for(int i=0; i<strLen; i++){
			tempCh = str.charAt(i);
			
			if(Character.isDigit(tempCh)){
				sum = Integer.parseInt(""+tempCh);
				if(flag){ 
					//when last value of tempCh was a number, it means num>9 (2 or more digit number) 
					numArr[j-1] = numArr[j-1]*10+sum;
				}else{
					numArr[j++] = sum;
				}		
				flag = true;
			}else{
				flag = false;
			}
			
		}
		sum=0;
		for(int i=0; i<j; i++){
			sum+=numArr[i];
		}
		System.out.println("sum : "+sum);
	}
	
	public static void main(String []args){
		//test case 1
		String str1 = "there are 12 girls and 2 boys in 1 classroom";
		System.out.println("Test case 1");
		System.out.println("Str1 : "+str1);
		AddNumOnly.add(str1);
		
		//test case 2
		String str2 = "1 muliplied by 110, equals 1000";
		System.out.println("Test case 2");
		System.out.println("Str2 : "+str2);
		AddNumOnly.add(str2);
	}
}