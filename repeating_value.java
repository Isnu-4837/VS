package practise;

import java.util.Scanner;

public class repeating_value {
	static int repeating(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Array Size : ");
		  int n=sc.nextInt();
		  int arr[]=new int[n];
		  System.out.println("Enter "+n+" Array Elements : ");
		  for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.nextInt();
		  }
		  System.out.println(repeating(arr));

	}

}
