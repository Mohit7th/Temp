package set4;

public class PermuteStr {
	private static void permute(String pref, String str){
		int n = str.length();
		if(n==0){
			System.out.println(pref);
		}else{
			for(int i=0; i<n; i++){
				permute(pref+str.charAt(i), str.substring(0, i)+str.substring(i+1, n));
			}
		}
	}
	
	//.........................OR............................
	
	public static void printAna(String pref, String word){
		if(word.length()<=1){
			System.out.println(pref+word);
		}else{
			for(int i=0; i<word.length(); i++){
				String cur = word.substring(i, i+1);
				String before = word.substring(0, i);
				String after = word.substring(i+1);
				printAna(pref+cur, before+after);
			}
		}
	}
	
	public static void main(String[] args) {
		//test case 1
		System.out.println("Test case 1 : abc");
		PermuteStr.permute("","abc");
				
		//test case 2
		System.out.println("Test case 2 : mohit");
		PermuteStr.permute("","mohit");

	}

}
