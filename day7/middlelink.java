package day7;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class middlelink {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(!sc.hasNextInt());
        if(n<=0){
            return;
        }
        Node head=new Node(sc.nextInt());
        Node current=head;
        for(int i=1;i<n;i++){
            current.next=new Node(sc.nextInt());
            current=current.next;
        }
        Node middle=findMiddle(head);
        if(middle!=null){
            System.out.println(middle.data);
        }
    }
    public static Node findMiddle(Node head){
        if(head==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
