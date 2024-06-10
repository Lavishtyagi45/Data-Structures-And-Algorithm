package SinglyLinkedList;
/*
 
Ques: Reverse a LinkedList - Iterative Approach         O(n)

*/

public class SinglyLinkedListQues2 {
  
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
        addLast(10);
        addFirst(9);
        addFirst(8);
        addLast(12);
        addInMiddle(11,3);
        printLinkedList();
        reverseLinkedList();
        printLinkedList();
    }     
    
    // reverse a linked list using iterative approach      
    public static void reverseLinkedList(){
        Node prev=null;
        Node current=head;
        Node next;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
}
