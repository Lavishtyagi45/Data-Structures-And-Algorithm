package Array;
/*

 * 1.Linear Search                  O(n)
 * 2.Sorting using Selection Sort   O(n**2)
 * 3.Binary Search                  O(log n)    base->2

 */

public class Array
{
    //main function 
    public static void main(String args[]){
    
        // input elements in array
        int a[]={1,2,5,6,4,9,8,7};     
    
        System.out.print("print array before sorting : ");
        printArray(a);
    
        //linear search
        int key = 5;
        int value = linearSearch(a, key);
        if(value == -1){
            System.out.println("key not found :");
        }
        else{
            System.out.println("key "+ key +" found at index using linear search: "+value);
        }
    
        //sort array using selection sort  
        sortArray(a); 
    
        System.out.print("print array after sorting using selection sort : ");
        printArray(a); 
    
        //binary search 
        int key_binary=9;
        int value_binary=binarySearch(a, key_binary);
        if(value_binary==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key "+ key_binary + " found at index using binary search: "+value_binary);
        }
    }
    //linear search in an array   
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    //binary search in an array
    public static int binarySearch(int a[],int key){
        int start=0;
        int end =a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==a[mid]){
                return mid;
            }
            if(key < a[mid]){
                //left
                end=mid-1;
            }
            else{ 
                //right
                start=mid+1;
            }
        }

        return -1;
    }

    //sort an array using selection sort
    public static void sortArray(int a[]){
        for(int i=0;i<a.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minindex]>a[j]){
                    minindex=j;
                }
            }
            //swap
            int temp=a[i];
            a[i]=a[minindex];
            a[minindex]=temp;
        }
    }
    
    // print an array
    public static void printArray(int a[]){
        int length=a.length;
        for(int i=0;i<length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}