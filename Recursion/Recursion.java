package Recursion;
/*

In Recursion we have a base case (Termination criteria) or have to find it
- iteration is fast than recursion 
- in recursion memory is re-allocated every time function is called
- in iteration memory is allocated once
- using recursion we can solve complex problems
       - we break problem into smaller parts and solve it 
         and with the help of it solve another one .
- Recursion
  Direct Recursion - function is calling itself
  Indirect Recursion - function is calling another function that calls the function.

*/

import java.util.Scanner;

public class Recursion {
    
    // factorial 
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    // main function 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find its factorial :");
        int n=sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }
    
}
