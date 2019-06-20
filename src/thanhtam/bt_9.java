package thanhtam;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class bt_9 {
	public static void result(int n, int[] arr) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static void Try(int[] arr, int i, int n) {
		
		for(int j=0;j<=1;j++) {
			arr[i]=j;
			if(i==n-1) result(n, arr);
			else Try(arr, i+1, n);
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter integer n: ");
		int n=scanner.nextInt();
		int[] arr= new int[n];
		Try(arr, 0, n);
		
		
	}

}
