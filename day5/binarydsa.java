// import java.util.Collections;
// import java.util.Scanner;
// import java.util.List;
// import java.util.ArrayList;
// public class binarydsa{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         List<Integer> list=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             list.add(sc.nextInt());
//         }
//         int target=sc.nextInt();
//         Collections.sort(list);
//         int binary=Collections.binarySearch(list,target);
//         if(binary>0){
//             System.out.println("Element is found: "+binary);
//         }
//         else{
//             System.out.println("Element is not found");
//         }
//         sc.close();
//     }
// }

import java.util.*;

public class binarydsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        System.out.println("Enter elements (in sorted order): ");
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        int left = 0;
        int right = n - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                res = mid;
                break;
            } 
            else if (a.get(mid) < x) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        if (res != -1)
            System.out.println(x + " Element is found: " + res);
        else
            System.out.println(x + " Not found");
    }
}