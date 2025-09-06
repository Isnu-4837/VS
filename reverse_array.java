package practise;

import java.util.Scanner;

public class reverse_array {
	static int[] reverse(int arr[]) {
		int n=arr.length;
		int[] rev=new int[n];
		int j=0;
		for(int i=n;i>0;i--) {
			rev[j++]=arr[i];
			
		}
		return rev;
	}
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
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
		  int ans[]=reverse(arr);
		  printArray(ans);

	}

}
