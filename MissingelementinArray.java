package week1.day2;

public class MissingelementinArray {
public static void main(String[] args) {
		
		int a[]= {1,2,3,4,7,6,8};
		for (int i = 1; i < a.length; i++) {
			int temp=i+1;
			if (a[i]!=temp) {
				System.out.println(temp);
				break;
			}
		}
     }


}
