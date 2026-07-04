// Problem: Implement linear search to find key k in an array. Count and display the number of comparisons performed.

// Input:
// - First line: integer n (array size)
// - Second line: n space-separated integers
// - Third line: integer k (key to search)

// Output:
// - Line 1: "Found at index i" OR "Not Found"
// Line 2: "Comparisons = c"

// Example:
// Input:
// 5
// 10 20 30 40 50
// 30

// Output:
// Found at index 2
// Comparisons = 3

// Explanation: Compared with 10, 20, 30 (found at index 2 with 3 comparisons)

//Solution 

import java.util.*;

public class Day_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of array : ");
        int n = sc.nextInt();

        System.out.print("Array elements : ");
        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find : ");
        int k = sc.nextInt();

        int count = 0;
        boolean found = false;

        for( int i = 0 ; i < n ; i++){
            count++;
            if(arr[i] == k){
                System.out.println("Found at index "+i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Not Found");
        }
        
        System.out.print("Comparisons = "+count);

        sc.close();

    }
}
