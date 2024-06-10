package Recursion;
/*

find x^y using recursion

*/

import java.util.Scanner;

public class RecursionQues1 {

    public static int getpower(int x,int y){
        if(y==0){
            return 1;
        }
        return x*getpower(x, --y);
    }
    
    // main function 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base value :");
        int x=sc.nextInt();
        System.out.print("Enter the power value :");
        int y=sc.nextInt();
        sc.close();
        System.out.println("value : "+getpower(x, y));
    }
}
