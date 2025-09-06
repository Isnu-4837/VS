package practise;

import java.util.Scanner;

public class a_raise_to_b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base : ");
		int a=sc.nextInt();
		System.out.println("Enter power : ");
		int b=sc.nextInt();
		int res=1;
		for(int i=1;i<=b;i++)
			res=res*a;
		System.out.println("Result : "+res);
		
	}

}
