package thanhtam;

import java.util.Scanner;

public class bt_1 {
	public static int GCF(int a, int b) {
		if(b==0) return a;
		return GCF(b, a%b);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer a: ");
		int a=sc.nextInt();
		System.out.println("Enter integer b: ");
		int b=sc.nextInt();
		System.out.println("=>Greatest common factor: " + GCF(a,b));
		System.out.println("=>Lowest common multiple: " + (a*b)/GCF(a,b));
	}

}
