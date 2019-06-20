package thanhtam;

import java.util.Scanner;

public class bt_10 {
	
	public static void result(int n, int[] arr) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static void Try(int i, int[] arr, int n, int k) {
		for(int j=i;j<n-k+i+1;j++) {
			
			arr[i]=j+1;
			if(i==k-1) result(k, arr);
			else Try(i+1, arr, n, k);
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=scanner.nextInt();
		System.out.println("Enter k: ");
		int k=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("Output: "); 
		Try(0, arr, n, k);
		
	}

}
