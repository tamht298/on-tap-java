package thanhtam;

import java.util.Scanner;

public class bt_11 {
	public static void result(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static void Try(int i, int n, int[] arr1, int[] arr2) {
		for(int j=0;j<n;j++) {
			
			if(arr2[j]==0) {
				arr1[i]=j+1;
				arr2[j]=1;
				if(i==n-1) result(arr1, n);
				else
					Try(i+1, n, arr1, arr2);
				arr2[j]=0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=scanner.nextInt();
		System.out.println("Permutation "+ n +" elements: ");
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		Try(0, n, arr1, arr2);
		
		
	}

}
