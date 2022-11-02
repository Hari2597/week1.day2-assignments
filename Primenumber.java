package week1.day2;

public class Primenumber {
public static void main(String[] args) {
		
		int num=13;
		int count=0;
		for (int i = 1; i<num;  i++) {
			if(num%i==0) count++;
		}
	if (count>0){
	System.out.println("13 is prime number");
	}
	else 
		System.out.println("13 is not prime number");
	
}
}
