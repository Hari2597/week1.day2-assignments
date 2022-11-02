package week1.day2;

public class PalindromeNumber {
	public static void main(String[] args) {
		 int r,sum=0; 
		 int n=34343; 
		  int num=n;
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(num==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		

	}



