package day7;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
public class revlinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if (!sc.hasNextInt()) return; 
        int n=sc.nextInt();
        if (n<=0) return;
        Node head=new Node(sc.nextInt());
        Node current=head;
        for (int i=1;i<n;i++) {
            current.next=new Node(sc.nextInt());
            current=current.next;
        }
        head=reverse(head);
        printList(head);
    }


    public static Node reverse(Node head) {
        Node prev=null;
        Node current=head;
        Node next=null;
        while (current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public static void printList(Node head) {
        while (head!=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
