package thanhtam;

import java.util.Scanner;

public class bt_7 {
	public static int Fibonacci(int n) {
		if(n==0 || n==1) return 1;
		return Fibonacci(n-1)+ Fibonacci(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer n: ");
		int n=sc.nextInt();
		System.out.println("Fibonacci n: " + Fibonacci(n));
		
	}
}
