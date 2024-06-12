package Queue;
public class Dequeue {
    int dq[];
    int start = 0;
    int end = 0;

    public Dequeue(int size){
        int n=size;
        dq=new int[n];
    }
    public void addLast(int x){
        if(end>=dq.length){
         System.out.println("Overflow");
        }
        else{
            dq[end]=x;
            end++;
        }
    }
    public void addFirst(int x){
        if(start == 0 && end == 0){
            addLast(x);
        }
        if(start<0){
            System.out.println("Overflow");
            return;
        }
        else{
            dq[start--]=x;
            start--;
        }
    }
    public void removeFirst(){
        if(start<end){
            start++;
        }
        else{
            System.out.println("underflow");
        }
    }
    public void removeLast(){
        if(end<dq.length && end>0){
            end--;
        }
        else{
            System.out.println("underflow");
        }
    }
    public void display(){
        if(start-end==0){
            System.out.println("Queue is empty");
            return;
        }
        else{
            for(int i=start;i<end;i++){
                System.out.print(dq[i]+" ");
            }
            System.out.println();
        }
    }

    //main method
    public static void main(String[] args) {
        Dequeue d=new Dequeue(5);
        d.addFirst(1);
        d.addFirst(0);
        d.display();
    }
}
