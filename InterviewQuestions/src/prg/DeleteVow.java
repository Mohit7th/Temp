/*
	@author : Mohit Uniyal
	Problem : Delete all vowels from a string
			  Input : HiThere
			  Output: HThr	
 */
package prg;

class DeleteVow {
	public static void deleteVowel(String str) {
		String new_str = "";
		char c;
		int len = str.length();

		for (int i = 0; i < len; i++) {
			c = str.charAt(i);
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
				new_str += str.charAt(i);
		}
		System.out.println("New String : " + new_str);
	}

	public static void main(String[] args) {
		// use case 1
		String str1 = "helloworld";
		System.out.println("Old String : " + str1);
		DeleteVow.deleteVowel(str1);

		// use case 2
		String str2 = "worldhello";
		System.out.println("Old String : " + str2);
		DeleteVow.deleteVowel(str2);
	}
}