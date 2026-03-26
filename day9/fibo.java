import java.util.Scanner;
public class fibo {
    public static int fiborec(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fiborec(n-1)+fiborec(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fiborec(n));
    }
}
