package thanhtam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bt_16 {

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
		
		Collections.sort(arrA);
		int count=1;
		for(int i=0;i<arrA.size();i++) {
			if(i+1<arrA.size() && arrA.get(i).equals(arrA.get(i+1))) count++;
			else {
				System.out.println(arrA.get(i)+": "+ count);
				count=1;
			}
		}
	}

}
