import java.util.Scanner;

public class bSort{
    public static void bSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
        bSort(arr);
        printArray(arr);
    }
}