// Problem: Write a program to check whether a given square matrix is an Identity Matrix. An identity matrix is a square matrix in which all diagonal elements are 1 and all 
// non-diagonal elements are 0.

// Input:
// - First line: integer n representing number of rows and columns
// - Next n lines: n integers each representing the matrix elements

// Output:
// - Print "Identity Matrix" if the matrix satisfies the condition
// - Otherwise, print "Not an Identity Matrix"

// Example:
// Input:
// 3
// 1 0 0
// 0 1 0
// 0 0 1

// Output:
// Identity Matrix

// solution

/*
if (m != n){
    print("Not identity");
}

for(i = 0 to m-1){
    for(i = 0 to n -1){
        if(i == j){
            if(arr[i][j] != 1){
                print(not identity);
                break;
            }
        else{
                if(arr[i][j] != 0){
                    print(not identity);
                    break;
                }
            }
        }
    }
}
print(Identity);

*/

import java.util.*;
public class Day_14{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        if( m != n){
            System.out.println("Not an Identity Matrix");
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(i == j){
                    if(arr[i][j] != 1){
                        System.out.println("Not an Identity Matrix");
                        break;
                    }
                }else{
                    if(arr[i][j] != 0){
                        System.out.println("Not an Identity Matrix");
                        break;
                    }
                }
            }
        }

        System.out.println("Identity Matrix");

        sc.close();
    }
}