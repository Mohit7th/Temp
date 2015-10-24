/*
 * @author : Mohit Uniyal
 * Problem : Reverse a string using recursion
 * 			 Input : "java";
 * 			 Output: "avaj"
 * solution: extract last character and call same method with string from which last character is removed
 */
package set2;

public class StrReverseRec {
	private static String reverseStr(String str){
		String revStr = "";
		if(str.length()==1){
			return str;
		}else{
			revStr+=str.charAt(str.length()-1)+reverseStr(str.substring(0, str.length()-1));
			return revStr;
		}
	}
	public static void main(String[] args) {
		//test case 1
		String str1 = "mohit";
		System.out.println("Test case 1");
		System.out.println("Str1 : "+str1);
		System.out.println ("subSeries : "+StrReverseRec.reverseStr(str1));
		
		//test case 2
		String str2 = "uniyal";
		System.out.println("Test case 2");
		System.out.println("Str2 : "+str2);
		System.out.println("subSeries : "+StrReverseRec.reverseStr(str2));
	}

}
