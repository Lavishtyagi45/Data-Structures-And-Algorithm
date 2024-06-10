package Recursion;
/*

print prime factor of a number 
e.g. 24 = 2*2*2*3

*/

import java.util.Scanner;

public class RecursionQues3{
    public static void primeFactor(int n,int i){
        if(i<=n){
            while(n%i==0){
                n /= i;
                if(n==1){
                    System.out.print(i);
                }
                else{
                    System.out.print(i+"*");
                }
            }
            primeFactor(n,i+1);
        }
        return;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        sc.close();
        primeFactor(n, 2);
    }
}
