import java.util.Scanner;

public class sSort {
    public static void sSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int[] arr){
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
        sSort(arr);
        printArray(arr);
    }
}

