package SinglyLinkedList;
/*

 1. Search (Iterative) for a key in a linked list.
    return the position (index) where it is found.
    if not found, return -1.                               O(n)
   
 2. Search (Recursive) for a key in a linked list.
    return the position(index) where it is found.
    if not found, return -1.                               O(n)    
    USE RECURSION ::                                       O(n)
                               
 */

 public class SinglyLinkedListQues1{
  
    // addFirst() method
    public static void addFirst(int value){
      Node newNode =new Node(value);
      newNode.next=head;
      head=newNode;
      size++;
    }
    
    // addLast() method 
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
    
    // addInMiddle(value,index) method  
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
    
    // print linked list
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
      int key=10;
      int value=iterativeSearch(key);
      if(value==-1){
        System.out.println("Key "+ key + " is not found.");
      }else{
        System.out.println("Key "+key+ " is found at index: " + value);
      }

      //Recursive search
      System.out.println(recursiveSearch(10));
      System.out.println(recursiveSearch(1));
    }

    // iterative Search in Linked list
    public static int iterativeSearch(int key){
        Node current=head;
        int index=0;

        while(current != null){
            if(current.value == key){
                return index;
            }
            current=current.next;
            index++;
        }
        return -1;
    }

    // recursive Search in linked list 
    // base case -> if current==null return -1;
    public static int recursiveSearch(int key){
        Node current=head;
        return checkKeyFound(current, key);
    }

    public static int checkKeyFound(Node current,int key){
        if(current==null){
            return -1;
        }
        if(current.value==key){
            return 0;
        }
        int index=checkKeyFound(current.next, key);
        if(index == -1){
            return -1;
        }

        return index+1;
    }
  }
  