package Stack;
import java.util.*;

public class Stack {
    ArrayList <Integer> stack=new ArrayList<>(5);
    int top=-1;
    int size=0;

    // push method
    public void push(int x){
        if(stack.size()<5){
            stack.add(x);
            size++;
        }
        else{
            System.out.println("overflow");
        }
       
    }

    // pop method
    public void pop(){
        if(size>0){
            stack.remove(stack.getLast());
            size--;
        }
        else{
            System.out.println("underflow");
        }
    }

    // display method
    public void display(){
       System.out.println(stack); 
    }

    // main method
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(0);
        s.push(1);
        s.display();
        s.pop();
        s.display();
    }
}

