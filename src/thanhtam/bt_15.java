package thanhtam;

import java.util.ArrayList;
import java.util.Scanner;

public class bt_15 {

	static Scanner scanner=new Scanner(System.in);
	public static void inputArray(ArrayList<Integer> arr, int sizeA) {
		for(int i=0;i<sizeA;i++) {
			System.out.print("A["+i+"]=");
			int x=scanner.nextInt();
			arr.add(x);
		}
	}
	public static int countFrequent(int i, ArrayList<Integer> arr) {
		int count=1;
		for(int j=0;j<arr.size();j++) {
			if(i!=j && arr.get(i).equals(arr.get(j))) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter size of array a: ");
		int sizeA=scanner.nextInt();
		ArrayList<Integer> arrA=new ArrayList<>();
		inputArray(arrA, sizeA);
		System.out.println("Array has only appeared 2 times: ");
		ArrayList<Integer> arrB=new ArrayList<>();
				
		for(int i=0;i<arrA.size();i++) {
			if(countFrequent(i, arrA)==2 && !arrB.contains(arrA.get(i))) {
				arrB.add(arrA.get(i));
			}
				
		}
		for(int j=0;j<arrB.size();j++) {
			System.out.println(arrB.get(j));
		}
		
	}

}
