package Array;
/*

Maximum and minimum of an array using minimum number of comparisons

Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

Examples:

Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
              Maximum element is: 35

*/

import java.util.Arrays;

public class ArrayQues4 {

    public static void main(String args[]){
        int arr[]={2,4,23,43,65,1,34};
        type1(arr);
        type2(arr);
        type3(arr);
        type4(arr);
    }

    public static void type1(int arr[]){
        // Time Complexity: O(n)
        // Auxiliary Space: O(1)
        // comparisions: 2*n
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max: "+max+"\n"+"min: "+min);
    }

    public static void type2(int arr[]){
        // Maximum and minimum of an array using Sorting:
        // Time Complexity: O(n*logn)
        // Auxiliary Space: O(1)
        // comparisions : n*logn
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println("max: "+max+"\n"+"min: "+min);
    }

    public static void type3(int arr[]){
        // Maximum and minimum of an array using Linear search:
        // Time Complexity: O(n)
        // Auxiliary Space: O(1) as no extra space was needed.
        // comparisions : 2*n
           
        int min=arr[0];
        int max=arr[0];

        if (arr[0] > arr[1]) {
            max = arr[0];
            min = arr[1];
        } else {
            max = arr[1];
            min = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max: "+max+"\n"+"min: "+min);

    }
    public static void type4(int arr[]){
        // Maximum and minimum of an array by comparing in pairs:
        // Time Complexity: O(n)
        // Auxiliary Space: O(1) as no extra space was needed.
        // comparisions: 3*n/2

        int n=arr.length;
        int min;
        int max;
        int i;

        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];
            } else {
                min = arr[0];
                max = arr[1];
            }
            i = 2;      
            // index set =2 because min and max are first two elements
        } 
         else {
            min = arr[0];
            max = arr[0];
            i = 1;
            // index set =1 because odd numbers of elements
        }

        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i + 1] < min) {
                    min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            i += 2;
        }
        System.out.println("max: "+max+"\n"+"min: "+min);
    }
}