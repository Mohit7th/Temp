package set4;

public class SubStrOccr {
	
	static int findOccr(String str, String subStr){
		int totalOccr = 0;
		int strLen = str.length(), subStrLen = subStr.length();
		String tempSubStr = "";
		for(int i=0; i<strLen-subStrLen+1; i++){
			tempSubStr = str.substring(i,i+subStrLen);
			if(subStr.equals(tempSubStr)){
				totalOccr++;
			}
		}
		return totalOccr;
	}
	
	public static void main(String[] args) {
		//test case 1
		String str1 = "helloabchello";
		System.out.println("Test case 1 : "+str1);
		System.out.println("occurance: "+SubStrOccr.findOccr(str1,"el"));
		
		//test case 2
		String str2 = "abcabcabcdabcbab";
		System.out.println("Test case 2 : "+str2);
		System.out.println("occurance: "+SubStrOccr.findOccr(str2,"abc"));
	}
}
