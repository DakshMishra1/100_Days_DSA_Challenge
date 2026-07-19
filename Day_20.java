// Problem: Given an array of integers, count the number of subarrays whose sum is equal to zero.

// Input:
// - First line: integer n
// - Second line: n integers

// Output:
// - Print the count of subarrays having sum zero

// Example:
// Input:
// 6
// 1 -1 2 -2 3 -3

// Output:
// 6

// Explanation: A subarray is a continuous part of the array. For the input array 1 -1 2 -2 3 -3, the following subarrays have sum zero: [1, -1], [2, -2], [3, -3], [1, -1, 2, -2], [2, -2, 3, -3], and [1, -1, 2, -2, 3, -3]. Since there are 6 such subarrays, the output is 6.

//Solution

import java.util.*;

public class Day_20 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) n = sc.nextInt();
        long count = 0;
        long prefix = 0;
        Map<Long, Integer> freq = new HashMap<>();

        freq.put(0L, 1);
        for (int i = 0; i < n; i++){
            long x = 0;
            if (sc.hasNextLong()) x = sc.nextLong();
            prefix += x;

            int f = freq.getOrDefault(prefix, 0);
            count += f;
            freq.put(prefix, f + 1);
        }
        System.out.println(count);


        sc.close();
    }
}
