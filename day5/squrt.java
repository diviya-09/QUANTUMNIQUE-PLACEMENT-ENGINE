import java.util.Scanner;
public class squrt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int left=0;
        int right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(mid*mid==n){
                ans=mid;
                break;
            }
            else if(mid*mid<n){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(ans);
    }
}