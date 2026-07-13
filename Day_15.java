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

public class Day_15 {
    
}

/*
srow = 0
erow = n-1
scol = 0
ecol = n-1

for( i = srow to erow){
    for( j = scol to ecol){
        temp = arr[i][j];

        arr[i][j] = arr[i][ecol];
        arr[i][ecol] = arr[erow][ecol];
        arr[erow][ecol] = arr[erow][scol];
        arr[erow][scol] = arr[srow][scol];

        scol++;
        ecol++;
        srow++;
        erow++;

    }
}
return arr;


*/