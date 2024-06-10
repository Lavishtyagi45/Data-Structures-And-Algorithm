package Array;
/*

Search in rotated sorted array

*/

public class ArrayQues8 {
    public static int binarySearchRotated(int nums[],int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) { 
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { 
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    //main function
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,0};
        int arr2[]={6,0,1,2,3,4,5};
        int arr3[]={4,5,6,0,1,2,3};
        System.out.println(binarySearchRotated(arr1, 1));
        System.out.println(binarySearchRotated(arr2, 1));
        System.out.println(binarySearchRotated(arr3, 1));
    }
}