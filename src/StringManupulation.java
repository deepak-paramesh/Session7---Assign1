import java.util.Scanner;


public class StringManupulation {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = Integer.parseInt(str);
			
		System.out.println("Converting string to int : " +i);
		
		System.out.println("Enter the integer : ");
		int integer = sc.nextInt();
		String str1 = Integer.toString(integer);
		
		System.out.println("Converting integer to string using toString method: " +str1);
		
		
		

	}
}
