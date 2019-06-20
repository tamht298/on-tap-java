package thanhtam;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bt_13 {
	static Scanner scanner=new Scanner(System.in);
	public static void inputArray(ArrayList<Integer> arr, int sizeA) {
		for(int i=0;i<sizeA;i++) {
			System.out.print("A["+i+"]=");
			int x=scanner.nextInt();
			arr.add(x);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter size of array a: ");
		int sizeA=scanner.nextInt();
		ArrayList<Integer> arrA=new ArrayList<>();
		inputArray(arrA, sizeA);
		
		System.out.println("Enter size of array b: ");
		int sizeB=scanner.nextInt();
		ArrayList<Integer> arrB=new ArrayList<>();
		inputArray(arrB, sizeB);
		
		Collections.sort(arrA);
		Collections.sort(arrB);
		
		
		arrA.addAll(arrB);
		Collections.sort(arrA);
		System.out.println("New Array after merge a&b:");
		for(int data: arrA) {
			System.out.print(data+" ");
		}
			
	}

}
