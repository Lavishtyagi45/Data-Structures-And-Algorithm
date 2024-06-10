package Array;
/*

 1.print all the pairs present in an array                 O(n**2)
 2.print all the possible subarray in given array          O(n**3)
 3.print maxsum and minsum of all subarray : Brute force - O(n**3)    

 */

public class ArrayQues2 {

    // print pairs in an array
    public static void printAllPairs(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
        int n = arr.length;
        int totalPairs = n * (n - 1) / 2;
        System.out.println("Total number of pairs :" + totalPairs);
    }

    // print sub-array : a continuous part of array
    public static void printSubArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        int m = arr.length;
        int totalSubArrays = m * (m + 1) / 2;
        System.out.println("Total number of sub arrays : " + totalSubArrays);
    }

    // print maxsum and minsum of all sub arrays
    public static void printMinMaxValueInSubArraySum(int arr[]) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    // subarray sum
                    sum += arr[k];
                }
                if (sum > maxVal) {
                    maxVal = sum;
                }
                if (sum < minVal) {
                    minVal = sum;
                }
                System.out.print(sum + " ");
            }
        }
        System.out.println();
        System.out.println("MIN-SUM VALUE OF SUBARRAY : " + minVal);
        System.out.println("MAX-SUM VALUE OF SUBARRAY : " + maxVal);
    }

    // main function
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printAllPairs(arr);
        printSubArray(arr);
        printMinMaxValueInSubArraySum(arr);
    }
}
