// Problem: Rotate Linked List Right by k Places - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n
// - Second line: n space-separated integers
// - Third line: integer k

// Output:
// - Print the linked list elements after rotation, space-separated

// Example:
// Input:
// 5
// 10 20 30 40 50
// 2

// Output:
// 40 50 10 20 30

// Explanation:
// Connect last node to head forming circular list. Traverse to (n-k)th node, set next to NULL, update head to (n-k+1)th node.

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
public class Day_29 {
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

        int k = sc.nextInt();

        if(head == null || head.next == null || k == 0){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            sc.close();
            return;
        }

        k = k %n;

        if( k == 0 ){
            Node curr = head;
            while (curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            sc.close();
            return;
        }

        tail.next = head; 

        int steps = n - k -1;
        Node newTail = head;

        for(int i = 0; i < steps; i++){
            newTail = newTail.next;
        }

        head = newTail.next;
        newTail.next = null;

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        sc.close();
    }
}
