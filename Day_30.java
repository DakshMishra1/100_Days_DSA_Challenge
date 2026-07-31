// Problem: Polynomial Using Linked List - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n (number of terms)
// - Next n lines: two integers (coefficient and exponent)

// Output:
// - Print polynomial in standard form, e.g., 10x^4 + 20x^3 + 30x^2 + 40x + 50

// Example:
// Input:
// 5
// 10 4
// 20 3
// 30 2
// 40 1
// 50 0

// Output:
// 10x^4 + 20x^3 + 30x^2 + 40x + 50

// Explanation:
// Each node stores coefficient and exponent. Traverse nodes to print polynomial in decreasing exponent order.

// Solution

import java.util.*;
class Node{
    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }
}

public class Day_30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;
        Node tail = null;

        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            int poly = sc.nextInt();
            Node newNode = new Node(value);
            Node newpoly = new Node(poly);

            if(head == null){
                head = newNode;
                tail = newpoly;
            }else{
                tail.next = newpoly;
                tail = newpoly;
            }
        }

        sc.close();
    }
}