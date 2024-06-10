package BasicSortingAlgorithms;
  /*
  
   Ques: to perform all the sorting algorithm in descending order 
   1.Bubble Sort          O(n**2)
   2.Selection Sort       O(n**2)
   3.Insertion Sort       O(n**2)
   4.Counting Sort        O(n+range)       range=largest+1

  */

public class BasicSortingQues {       

    // bubble sort 
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    // selection sort 
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int maxpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxpos]<arr[j]){
                    maxpos=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[maxpos];
            arr[maxpos]=temp;
        }
    }

    // insertion sort  
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int prev=i-1;
            while(prev >=0 && arr[prev]< current){
                if(arr[prev]<arr[prev+1]){
                    arr[prev+1]=arr[prev];
                    prev--;
                }
            }
            // correct position of current 
            arr[prev+1]=current;
        }
    }

    // counting sort     
    public static void countingSort(int arr[]){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];

        // count the appearance of element in array arr and store in array count
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        System.out.println("count array:");
        printArray(count);

        //sort in descending order
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }

    // print an array
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }    
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        System.out.print("Bubble Sort : ");
        printArray(arr);
        selectionSort(arr);
        System.out.print("Selection Sort : ");
        printArray(arr);
        insertionSort(arr);
        System.out.print("Insertion Sort : ");
        printArray(arr);
        countingSort(arr);
        System.out.print("Counting Sort : ");
        printArray(arr);
    }
}
