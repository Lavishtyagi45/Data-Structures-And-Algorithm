package SinglyLinkedList;
public class SinglyLinkedList{
  
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

  // removeFirst()
  public static void removeFirst(){
    if(size==0){
      System.out.println("LinkedList is empty");
    }
    else{
      head=head.next;
      size--;
    }
  }

  // removeLast()
  public static void removeLast(){
    if(size==0){
      System.out.println("LinkedList is empty");
    }
    else{
     Node current=head;
     while(current.next.next!=null){
      current=current.next;
     } 
     current.next=null;
     size--;
    }
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
    printLinkedList();
    addLast(10);
    printLinkedList();
    addFirst(9);
    printLinkedList();
    addFirst(8);
    printLinkedList();
    addLast(12);
    printLinkedList();
    addInMiddle(11,3);
    printLinkedList();
    removeFirst();
    printLinkedList();
    removeLast();
    printLinkedList();
  }
}
