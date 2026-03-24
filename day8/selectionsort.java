package day8;
import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int mid=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mid]){
                    mid=j;
                }
            }
                int temp=arr[mid];
                arr[mid]=arr[i];
                arr[i]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.err.print(arr[i]+ " ");
        }
    }
}
