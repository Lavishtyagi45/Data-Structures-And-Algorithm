/*

Spiral matrix 
in clockwise direction

*/

public class _2DArrayQues1 {
    public static void spiralMatrix(int arr[][]){
        int rowLow=0;
        int colLow=0;
        int rowHigh=arr[0].length-1;
        int colHigh=arr.length-1;
        while(rowLow<=rowHigh && colLow==colHigh){
            for(int j=rowLow;j<=rowHigh;j++){
                System.out.print(arr[colLow][j]+" ");
            }
            for(int i=colLow+1;i<=colHigh;i++){
                System.out.print(arr[i][rowHigh]+" ");
            }
            for(int i=rowHigh-1;i>=rowLow;i--){
                System.out.print(arr[colHigh][i]+" ");
            }
            for(int i=colHigh-1;i>colLow+1;i--){
                System.out.print(arr[i][rowLow]);
            }
            rowLow++;
            rowHigh--;
            colLow++;
            colHigh--;    
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11}};
        spiralMatrix(arr);
    }
}
