// Problem: A secret system stores code names in forward order. To display them in mirror format, you must transform the given code name so that its characters appear in the opposite order.

// Input:
// - Single line: a lowercase string containing only alphabetic characters (no spaces)

// Output:
// - Print the transformed code name after applying the mirror operation

// Example:
// Input:
// hello

// Output:
// olleh

// Explanation: The first character moves to the last position, the second to the second-last, and so on until the entire string is mirrored

// Solution
import java.util.*;
public class Day_9{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char[] arr = new char[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.println(Arrays.toString(arr));

        sc.close();

    }
}