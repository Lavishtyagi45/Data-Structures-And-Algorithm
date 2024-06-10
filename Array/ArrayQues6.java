package Array;
/*

Rain water trapping - 
    maxLeft
    maxRight
    min= min(maxLeft,maxRight)
    sum += min-arr[index]

*/

public class ArrayQues6 {
    public static int rainWaterTrapping(int arr[]){
        int maxLeft[]=new int[arr.length];
        int maxRight[]=new int[arr.length];
        int min[]=new int[arr.length];
        int sum=0;
        
        // max Left]
        int maxleft=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(maxleft<arr[i]){
                maxleft=arr[i];
            }

            maxLeft[i]=maxleft;    
        }
        
        // max Right
        int maxright=Integer.MIN_VALUE;
        for(int j=arr.length-1;j>=0;j--){
            if(maxright < arr[j]){
                maxright=arr[j];
            }

            maxRight[j]=maxright;
        }

        // min(maxLeft,maxRight) and calculate sum
        for(int k=0;k<arr.length;k++){
            if(maxLeft[k] < maxRight[k]){
                min[k]=maxLeft[k];
            }
            else{
                min[k]=maxRight[k];
            }
            sum += min[k]-arr[k];
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,5,0};
        int arr2[]={6,1,3,4,2,0,7};
        System.out.println(rainWaterTrapping(arr));
        System.out.println(rainWaterTrapping(arr2));
    }
}
