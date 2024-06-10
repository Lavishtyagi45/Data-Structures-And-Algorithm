package SinglyLinkedList;
/*

Question: delete Nth node from the end of a linked list

*/

public class SinglyLinkedListQues3 {
  // addFirst() method  ----   O(1)
  public static void addFirst(int value){
    Node newNode =new Node(value);
    newNode.next=head;
    head=newNode;
    size++;
  }
  
  // addLast() method   ----   O(n)
  public static void addLast(int value){
    Node newNode =new Node(value);
    if(head==null){
      newNode.next=head;
      head=newNode;
    }
    else{
      Node current=head;
      while(current.next!=null){
        current=current.next;
      }
      newNode.next=current.next;
      current.next=newNode;
    }
    size++;
  }
  
  // addInMiddle(value,index) method   ---  O(n)
  // -> add value before index and make the value's indexvalue as index.
  public static void addInMiddle(int value,int index){
    int i=0;
    Node current=head;
    Node newNode =new Node(value);
    while(i<index-1){
      current=current.next;
      i++;
    }
    newNode.next=current.next;
    current.next=newNode;
    size++;
  }
  
  // print linked list  ----  O(n)
  public static void printLinkedList(){
    Node current = head;
    while(current!=null){
      System.out.print(current.value + " -> ");
      current=current.next;
    }
    System.out.println("null");
    System.out.println("Size of LinkedList : " + size);
  }
  
  // Node
  public static class Node{
    int value;
    Node next;
    public Node(int v){
      value=v;
      next=null;
    }
  } 
  
  // initialize head
  public static Node head;
  public static int size=0;
  
  // main method
  public static void main(String[] args) {
    addFirst(1);
    addLast(2);
    addLast(3);
    addFirst(0);
    addLast(10);
    printLinkedList();
    int N=3;
    deleteNthNodeFromEnd(N);
    printLinkedList();
  }

  // delete Nth node from end in a linked list
  public static void deleteNthNodeFromEnd(int N){
    int sz=0;
    Node current=head;
    while(current!=null){
        current=current.next;
        sz++;
    }

    // if nth node from end is head
    if(N==sz){
        head=head.next;
    }
    int i=1;
    int iToFind=sz-N;
    current=head;
    while(i<iToFind){
        current=current.next;
        i++;
    }
    current.next=current.next.next;
    size--;
  }
}
