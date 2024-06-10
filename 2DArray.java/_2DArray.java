/*

arr[m][n]
2D arrays are represents matrices
n=arr.length
m=arr[0].length

*/

public class _2DArray {

    // print 2D array
    public static void print2DArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    
    }

    // linear search
    public static void linearSearch(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("key is found at [" + i + "," + j + "]");
                    return;
                }
            }
        }  
        System.out.println("key not found");  
    }
    
    // max element in 2D array
    public static int maxElement(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }

    // number of 7's in 2D array
    public static int numberOf7s(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==7){
                count++;
            }
          }
        }
        return count;
    }

    // sum of nth row in a 2D array
    public static int sumOfNthRow(int arr[][],int n){
        int sum=0;
        int i=n-1;
        for(int j=0;j<arr[0].length;j++){
            sum += arr[i][j];
        }
        return sum;
    }

    // transpose of a matrix
    public static void transposeOfAMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i>j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;   
                }
            }   
        } 
        print2DArray(arr);
    }  

    //main function
    public static void main(String[] args) {
        int arr[][]={{1,12,21},{23,34,32},{13,31,24}};
        print2DArray(arr);        
        linearSearch(arr, 34);
        System.out.println(maxElement(arr));
        System.out.println(numberOf7s(arr));
        System.out.println(sumOfNthRow(arr, 2));
        transposeOfAMatrix(arr);
    }
}
