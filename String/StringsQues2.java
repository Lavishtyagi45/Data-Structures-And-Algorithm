package String;
public class StringsQues2 {

    /*  
    
    Ques: Given a route containing 4 directions (E,W,N,S), 
    find the shortest path to reach destination.   O(n)

    */

    // shortest path 
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='W'){
                x--;
            }
            else if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else{
                x++;
            }
        }
        return (float) Math.sqrt(x*x + y*y);    // convert double into float
    }

    //main function
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println("Shortest path : "+getShortestPath(path));
    }
}
