// Problem: Circular Linked List Creation and Traversal - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n
// - Second line: n space-separated integers

// Output:
// - Print the circular linked list elements starting from head, space-separated

// Example:
// Input:
// 5
// 10 20 30 40 50

// Output:
// 10 20 30 40 50

// Explanation:
// Last node's next points to head. Traverse from head until returning to head to avoid infinite loop.

// Solution

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }
}
public class Day_28{
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

        if(tail != null){
            tail.next = head;
        }

        if(head != null){
            Node curr = head;

            do { 
                System.out.print(curr.data + " ");
                curr = curr.next; 
            } while (curr != head);
        }

        sc.close();
    }
}