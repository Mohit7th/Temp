/*
 * @author : Mohit Uniyal
 * Problem : Find largest sub series in a string
 * 			 Input : "aaabbbbbccdddd";
 * 			 Output: "bbbbb"
 * solution: finding the maximum repeated character and its total occurrences
 */

package set2;

public class LargestSubSeries {
	
	public static String find(String str){
		int strLen = str.length();
		int newMaxOccr = 0, currentMaxOccr = 0; 
		char newdMaxOccrChar , maxOccrChar, ch ;
		newdMaxOccrChar =  ch = maxOccrChar = '\u0000';
		
		for(int i=0; i<strLen; i++){
			ch = str.charAt(i);
			currentMaxOccr=0;
			for(int j=i; j<strLen; j++){
				if(ch==str.charAt(j)){ 
					currentMaxOccr++;  newdMaxOccrChar=ch;
				}else{
					break;
				}
				if(newMaxOccr<currentMaxOccr){
					maxOccrChar = newdMaxOccrChar;
					newMaxOccr = currentMaxOccr;
				}
			}
		}
		//using total occurrences generating subSeries 
		String subSeries = ""; 
		for(int i=0; i<newMaxOccr; i++){
			subSeries+=maxOccrChar;
		}
		return subSeries;
	}
	
	public static void main(String []args){
		//test case 1
		String str1 = "aabbbbbcccdddd";
		System.out.println("Test case 1");
		System.out.println("Str1 : "+str1);
		System.out.println ("subSeries : "+LargestSubSeries.find(str1));
		
		//test case 2
		String str2 = "aaaaaabcccddddd";
		System.out.println("Test case 2");
		System.out.println("Str2 : "+str2);
		System.out.println("subSeries : "+LargestSubSeries.find(str2));
	}
}
