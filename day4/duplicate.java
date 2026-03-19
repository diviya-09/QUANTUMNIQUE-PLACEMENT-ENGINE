import java.util.Scanner;
import java.util.HashSet;
public class duplicate{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);
    }
}