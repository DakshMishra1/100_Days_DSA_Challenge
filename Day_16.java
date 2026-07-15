// Problem: Given an array of integers, count the frequency of each distinct element and print the result.

// Input:
// - First line: integer n (size of array)
// - Second line: n integers

// Output:
// - Print each element followed by its frequency in the format element:count

// Example:
// Input:
// 5
// 1 2 2 3 1

// Output:
// 1:2 2:2 3:1

// Solution

import java.util.*;
public class Day_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();

            if (map.containsKey(num)) {
            
                map.put(num, map.get(num) + 1);
            
            } else {
                map.put(num, 1);
            }

        //     map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));   
        }
        
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     System.out.println(entry.getKey() + ":" + entry.getValue());
        // }

        

        sc.close();
    }
}
