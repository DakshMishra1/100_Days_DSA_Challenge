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
bool diagonal = false;
bool non_dia = false;

for(i = 0; i < m; i++){
    for(j= 0; j <n; j++){
        if (m == n){
            if(arr[m][n] == 1){
                diagonal = true;
                return diagonal;
            }
        }
        if(m != n){
            if(arr[m][n] == 0){
                non_dia = true;
                return non_dia;
            }
        }
    }    
}

if(diagonal && non_diagonal == true){
    sys.out.print("Identity matrix");
}

*/