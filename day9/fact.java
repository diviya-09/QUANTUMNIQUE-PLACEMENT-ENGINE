import java.util.Scanner;
public class fact {
    public static int factrec(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factrec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factrec(n));
    }
}
