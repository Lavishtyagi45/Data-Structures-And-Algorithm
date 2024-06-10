package Recursion;
/*
 
print 1 to n using recursion

*/

import java.util.Scanner;

public class RecursionQues2 {

    public static void printNumbers(int n){
        if(n==1){
            System.out.println(n);
        }
        else{
            printNumbers(n-1);   
            System.out.println(n);
        }
    }
    
    // main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a natural number :");
        int n=sc.nextInt();
        sc.close();
        printNumbers(n);
    }
}
