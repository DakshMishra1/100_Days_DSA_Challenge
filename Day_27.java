// Problem: Find Intersection Point of Two Linked Lists - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n
// - Second line: n space-separated integers (first list)
// - Third line: integer m
// - Fourth line: m space-separated integers (second list)

// Output:
// - Print value of intersection node or 'No Intersection'

// Example:
// Input:
// 5
// 10 20 30 40 50
// 4
// 15 25 30 40 50

// Output:
// 30

// Explanation:
// Calculate lengths, advance pointer in longer list, traverse both simultaneously. First common node is intersection.

// Solution

import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int value){
        this.data = value;
        this.next = null;
    }
}
public class Day_27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;
        Node tail = null;

        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        int m = sc.nextInt();
        Node head2 = null;
        Node tail2 = null;

        for(int j = 0; j < m; j++){
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if(head2 == null){
                head2 = newNode;
                tail2 = newNode;
            }else{
                tail2.next = newNode;
                tail2 = newNode;
            }
        }




        sc.close();
    }
}
