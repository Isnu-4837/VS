import java.util.Scanner;

public class matrix_addition {
    public static void printMatrix(int arr[][]){
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.println(arr[i][j]+" ");
        }
        System.out.println();
       }
 
    }
    public static void addMatrix(int arr1[][],int arr2[][],int r1,int c1,int r2,int c2){
        if(r1!=r2||c1!=c2){
            System.out.println("Addition Isn't Possible");
            return;
        }
        int sum[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
            sum[i][j]=arr1[i][j]+arr2[i][j];
            }
         }
         printMatrix(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1st Array");
        System.out.println("Enter No. of Rows:");
        int r1=sc.nextInt();
        System.out.println("Enter No. of Columns:");
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
            arr1[i][j]=sc.nextInt();
        }
        }
        System.out.println("2nd Array");
        System.out.println("Enter No. of Rows:");
        int r2=sc.nextInt();
        System.out.println("Enter No. of Columns:");
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
            arr2[i][j]=sc.nextInt();
        }
        }
        addMatrix(arr1,arr2,r1,c1,r2,c2);

    }
}
