package thanhtam;

import java.util.ArrayList;
import java.util.Scanner;

public class bt_8 {
	public static int isReversed(int n) {
		int reversed=0;
		while(n!=0) {
			int digit=n%10;
			reversed=digit+ reversed*10;
			n=n/10;
			
		}
		return reversed;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Invert numbers have 6 digits: ");
		for(int i=100000;i<=999999;i++) {
			if(i==isReversed(i)) {
				System.out.println(i);
			}
		}
	}
}
