package Array;
public class ArrayQues1 {
    /*

    1. reverse an array             t.c -> O(n)  s.c -> O(1)
    2.largest number in an array           O(n)
    
     */
       
        public static void reverseArray(int arr[]){
            int start=0;
            int end=arr.length-1;
            while(start<end){
                //swap
                int temp =arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    
        
        public static int largestNumber(int arr[]){
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>largest){
                    largest=arr[i];
                }
            }
            return largest;
        }

        // print an array
        public static void printArray(int a[]){
         int length=a.length;
         for(int i=0;i<length;i++){
           System.out.print(a[i]+" ");
         }
         System.out.println();
        }

        public static void main(String[] args) {
        // input elements in array
        int a[]={1,2,5,6,4,9,8,7}; 
        System.out.print("print array : ");
        printArray(a);
        //reverse given array
        System.out.print("reverse array : ");
        reverseArray(a);    
        printArray(a);
        //find largest number in given array
        System.out.println("largest number in array : " + largestNumber(a));
        }
     
}
