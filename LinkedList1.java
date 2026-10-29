import java.util.Scanner;
class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
  }
}
public class LinkedList1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);

    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
