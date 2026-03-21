import java.util.Scanner;
public class target {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0;i < arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int right=n-1;
        while(left<=right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(left+" "+right);
                break;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
    }
}
