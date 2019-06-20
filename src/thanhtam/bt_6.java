package thanhtam;

import java.util.Scanner;

public class bt_6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number n: ");
		int n=scanner.nextInt();
		System.out.println(n +" first prime numbers: ");
		int count = 0;
		int i=2;
		while(count!=n) {
			
			if(bt_5.isPrime(i)==1) {
				System.out.print(i +" ");
				count++;
			}
			i++;
		}
	}
}
