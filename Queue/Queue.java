package Queue;
public class Queue {
    int q[];
    int start = 0;
    int end = 0;

    public Queue(int size){
        int n=size;
        q=new int[n];
    }
    public void add(int x){
        if(end>=q.length){
         System.out.println("Overflow");
         return;
        }
        else{
            q[end]=x;
            end++;
        }
    }
    public void remove(){
        if(start<end){
            start++;
        }
        else{
            System.out.println("underflow");
        }
    }
    public void display(){
        if(start-end==0){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=start;i<end;i++){
                System.out.print(q[i]+" ");
            }
            System.out.println();
        }
    }

    // main function
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(0);
        q.add(1);
        q.add(2);
        q.display();
        q.remove();
        q.display();
        q.add(3);
        q.add(4);
        q.add(0);
        q.display();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.display();
    }
}
