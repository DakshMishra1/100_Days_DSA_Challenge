// Problem: Write a recursive function fib(n) to compute the n-th Fibonacci number where fib(0)=0 and fib(1)=1.

// Input:
// - Single integer n

// Output:
// - Print the n-th Fibonacci number

// Example:
// Input:
// 6

// Output:
// 8

// Explanation: Sequence: 0,1,1,2,3,5,8 at positions 0,1,2,3,4,5,6

// Solution

import java.util.Scanner;

class Solution {

    public int fib(int n) {

        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
public class Day_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution fib1 = new Solution();

        int result = fib1.fib(n);

        System.out.println(result);

        sc.close();
    }
}
