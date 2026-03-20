import java.util.*;
public class firstrepeating {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer>firstrepeating=new HashSet<>();
        int count=0;
        for(int num:arr){
            if(!set.add(num)){
                firstrepeating.add(num);
                count++;
                break;
            }
        }
        System.out.println(firstrepeating);
    }
}