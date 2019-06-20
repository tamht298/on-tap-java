package thanhtam;

import java.util.Scanner;

public class bt_2 {
	public static void baseConvert(int n, int base) {
		switch(base) {
			case 2:{
				System.out.println("Binary number: "+ Integer.toBinaryString(n));
				break;
			}
			case 8:{
				System.out.println("Octal number: "+ Integer.toOctalString(n));
				break;
			}
			case 16:{
				System.out.println("Hexa number: "+ Integer.toHexString(n));
				break;
			}
			default: 
				System.out.println("Not support!");
				break;
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter integer need to convert: ");
		int n=scanner.nextInt();
		System.out.println("Base to convert (2 or 8 or 16): ");
		int base =scanner.nextInt();
		baseConvert(n, base);
		
		
	}
}
