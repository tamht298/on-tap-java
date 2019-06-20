package thanhtam;

import java.util.Scanner;

public class bt_3 {
	public static int Sum(int n) {		
		int sum=0;
		while(n!=0) {
			int temp=n%10;
			sum+=temp;
			n=n/10;	
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter integer n: ");
		int n=scanner.nextInt();
		System.out.println("Sum member of "+ n +": "+ Sum(n));
	}

}
