package Recursion;
/*

print nth term of fibonacci series

*/

import java.util.Scanner;

public class RecursionQues4{
    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        sc.close();
        System.out.println(fibonacci(n));
    }
}