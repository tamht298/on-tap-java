package thanhtam;

import java.util.ArrayList;
import java.util.Scanner;

public class bt_4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter integer n: ");
		int n=scanner.nextInt();
		System.out.print("The prime factorisation of "+ n + "= ");
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=2;i<=n;i++) {
			while(n%i==0) {
				arr.add(i);
				n/=i;
			}
		}
		
		for(int i=0;i<arr.size();i++) {
			if(i!=arr.size()-1) {
				System.out.print(arr.get(i)+ "x");
			}
			else
			System.out.print(arr.get(arr.size()-1));
			
		}
		
	}

}
