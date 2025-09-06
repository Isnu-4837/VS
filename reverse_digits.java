package practise;

import java.util.Scanner;

public class reverse_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice : ");
		int n=sc.nextInt();
		int count=0;int rem=0;
		int sum=0;int rev=0;
		while(n!=0) {
		rem=n%10;
		n=n/10;
		rev=rev*10+rem;
		}
		System.out.println(rev);
	}

}
