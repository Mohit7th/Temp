/*
 * @author : Mohit Uniyal
 * Problem : Program to replace a sub string from a String
 * 			 Input : "hi hello how are you" subStr="h" replaceWith="WHY"
 * 			 Output: "WHYi WHYello WHYow are you"
 */
package nec;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSub {

	public static void main(String[] args) {
		// test case 1
		String str1 = "what if what can be replaced";
		System.out.println("Input : "+str1);
		ReplaceSub.replaceSubStr(str1, "what", "HAHA");

		// test case 2
		String str2 = "what is this?";
		System.out.println("Output : "+str2);
		ReplaceSub.replaceSubStr(str2, "is", "HAHA");
	}

	//subStr which we want to replace
	public static void replaceSubStr(String str, String subStr, String repStr) {
		Pattern pattern = Pattern.compile(subStr);
		Matcher matcher = pattern.matcher(str);
		
		str = matcher.replaceAll("HAHA");
		System.out.println("Output : "+str);
	}
}
