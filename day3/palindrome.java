import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n!=0){
            int x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}