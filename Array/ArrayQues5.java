package Array;
/*

Given an integer array nums, 
return true if any value appears at least twice in the array,
 and return false if every element is distinct.

*/

import java.util.HashSet;
import java.util.Set;

public class ArrayQues5 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    //main function

    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,52,21,2,12,34,45};
        System.out.println(containsDuplicate(arr));
    }

}
