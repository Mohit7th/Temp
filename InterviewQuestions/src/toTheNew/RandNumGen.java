package toTheNew;
/*
 * @author : Mohit uniyal
 * Problem : generate random number between 100 to 200 using getRandomNumber() which can only generate
 * 			 Numbers between 0 to 9
 */
import java.util.Random;

public class RandNumGen {

	public static void main(String[] args) {
		
		RandNumGen.type1();
		RandNumGen.type2();
	}
	public static void type1(){
		int n1 = RandNumGen.getRandomNumber(); 
		int n2 = RandNumGen.getRandomNumber();
		int n3 = RandNumGen.getRandomNumber();
		int n4 = RandNumGen.getRandomNumber();
	
		
		int rand_num = (100+n1*n2+n3+n4);
		//when n1 to n4 are 0, in that case rand_num will be 100
		//but we need numbers between 101 to 199
		rand_num = (rand_num==100)?rand_num+1: rand_num;
		
		System.out.println("random : "+rand_num);
	}
	
	public static void type2(){
		int n1 = RandNumGen.getRandomNumber(); 
		int n2 = RandNumGen.getRandomNumber();
		
		int rand_num = (100+n1*10+n2);
		rand_num = (rand_num==100)?rand_num+1: rand_num;
		
		System.out.println("random : "+rand_num);
	}
	
	public static  int getRandomNumber(){
		Random ran = new Random();
		return ran.nextInt(10);
	}
}
