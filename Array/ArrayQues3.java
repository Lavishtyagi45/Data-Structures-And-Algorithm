package Array;
/*

bruteforce approach O(n**3) -- ArrayQues2.java
Max Subarray Sum using prefix array  - better approach  O(n**2)
   optimal approach -- Kadane's Algorithm O(n)

prefix array:
index=0 sum=arr[0]
 index=1 sum=arr[0]+arr[1]
 index=2 sum=arr[0]+arr[1]+arr[2]
 ... so on ..

*/
public class ArrayQues3 {

    public static void maxSubArraySum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int currSum=0;
                currSum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }

            }
        }
        
        System.out.println("max sum : "+maxSum);
    }

     /*
 
    kadane's algorithm:
     if current sum == -ve num ,update current sum =0
      (add negative number in current sum until
       current sum become negative)
     max sum contains only max value of current sum

     */

    public static void kadanes(int nums[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        int maxNeg=Integer.MIN_VALUE;
        int value=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            maxNeg= curr > maxNeg ? curr : maxNeg ;
            if(curr<0){
                curr=0;
                value++;
            }
            max= curr > max ? curr : max ;
        }
        if(value==nums.length){
            max=maxNeg;
        }
        System.out.println("max sum : "+max);
    }

    //main function
    public static void main(String[] args) {
        int arr[] = { -2, 4, -2, 8, -1 };
        maxSubArraySum(arr);
        kadanes(arr);
    }
}