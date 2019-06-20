package thanhtam;

import java.util.Scanner;

public class bt_5 {
	public static int isPrime(int n) {
		if(n==2) return 1;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return 0;
		}
		return 1;
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter integer n: ");
		int n=scanner.nextInt();
		System.out.println("All numbers prime that is smaller than "+ n +": ");
		for(int i=2;i<n;i++) {
			if(isPrime(i)==1) System.out.println(i);
		}
	}

}
