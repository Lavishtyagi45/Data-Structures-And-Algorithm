package String;
/* 
  
for a given set of Strings , print the largest string [Lexicographically]
--  O(x*n)

*/

public class StringsQues3 {

    public static void printLargestString(String arr[]){
        String largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest.compareToIgnoreCase(arr[i])<0){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }

    // main function
    public static void main(String[] args) {
        String fruits[]={"Apple","mango","banana","orange"};
        printLargestString(fruits);
    }
}
