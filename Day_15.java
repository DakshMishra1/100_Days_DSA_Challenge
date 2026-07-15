// Problem: Given a matrix, calculate the sum of its primary diagonal elements. The primary diagonal consists of elements where row index equals column index.

// Input:
// - First line: two integers m and n
// - Next m lines: n integers each

// Output:
// - Print the sum of the primary diagonal elements

// Example:
// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9

// Output:
// 15

// Explanation:
// 1 + 5 + 9 = 15

// Solution

import java.util.*;
public class Day_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int arr = sc.nextInt();

                if( i == j){
                    sum += arr;
                }
            }
        }

        System.out.println(sum);

        sc.close();
    }
}