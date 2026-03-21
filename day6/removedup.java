import java.util.Scanner;
import java.util.Arrays;
public class removedup {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n == 0){
            System.out.println("Array is empty");
        }
        Arrays.sort(arr);
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        for (int k=0; k <=i; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
