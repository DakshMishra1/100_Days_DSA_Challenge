// Problem: Given integers a and b, compute a^b using recursion without using pow() function.

// Input:
// - Two space-separated integers a and b

// Output:
// - Print a raised to power b

// Example:
// Input:
// 2 5

// Output:
// 32

// Explanation: 2^5 = 2 * 2 * 2 * 2 * 2 = 32

// Solution 

import java.util.*;

public class Day_8{

    public int pow(int a, int b){

        if(b == 0){
            return 1;
        }
        return a*pow(a, b-1);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Day_8 obj = new Day_8();
        
        System.out.print(obj.pow(a,b));
        
        sc.close();


    }
}