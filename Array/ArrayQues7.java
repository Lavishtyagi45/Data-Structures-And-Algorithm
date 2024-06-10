package Array;
/*

chocolate distribution problem
number of students = n 
The difference between the number of chocolates in the packet 
with maximum chocolates and the packet with minimum chocolates 
given to the students is minimum.

*/

import java.util.Arrays;

public class ArrayQues7 {
    public static void main(String[] args) {
        int arr[]={1,23,2,3,32,41,3,21,1,24};
        System.out.println(chocolateDistribution(arr, 5));
    }

    // maxdiff and mindiff of chocolate between all the students
    public static int chocolateDistribution(int arr[],int n){
        if(arr.length==0 || n==0){
            return 0;
        }
        // first we sort the array -
        Arrays.sort(arr);
        // check if number of chocolate packets are lesser than student
        // then return -1
        if(arr.length-1<n){
            return -1;
        }
        //initialize min diff to max value
        int mindiff =Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(i+n > arr.length){
                break;
            }
            int diff=arr[i+n-1]-arr[i];
            mindiff = mindiff > diff ? diff : mindiff;
        }
        
        return mindiff;
    }
}
