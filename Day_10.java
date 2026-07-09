// Problem: Read a string and check if it is a palindrome using two-pointer comparison.

// Input:
// - Single line: string s

// Output:
// - Print YES if palindrome, otherwise NO

// Example:
// Input:
// level

// Output:
// YES

// Explanation: String reads same forwards and backwards

// Solution 

import java.util.*;

public class Day_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int left = 0;
        int right = str.length() - 1;

        boolean valid = true;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){

                valid = false;
                break;
            }
            left++;
            right--;

        }

        if(valid){
            System.out.println("Yes");
        }else{
            System.err.println("No");
        }

        sc.close();
    }
}