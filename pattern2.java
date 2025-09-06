package practise;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=0,j=0;
		for(i=0;i<a;i++){
		  for(j=0;j<b;j++){
			  if(i==0||i==a-1||j==0||j==b-1)
		    System.out.print("*");
			  else {
		    System.out.print(" ");	  
			  }
		  }  
		  System.out.println(" ");
		}
		}

	}


