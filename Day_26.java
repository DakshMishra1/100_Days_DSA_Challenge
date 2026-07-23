// Problem: Doubly Linked List Insertion and Traversal - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n
// - Second line: n space-separated integers

// Output:
// - Print the linked list elements in forward order, space-separated

// Example:
// Input:
// 5
// 10 20 30 40 50

// Output:
// 10 20 30 40 50

// Explanation:
// Each DNode has data, next, prev. Insert DNodes sequentially, traverse from head using next pointer.

//Solution

import java.util.*;

class DNode {
    int data;
    DNode next;
    DNode prev;

    public DNode(int value) {
        this.data = value;
        this.next = null;
        this.prev = null;
    }
}

public class Day_26 {

    // Method to print the doubly linked list
    public static void display(DNode head) {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        DNode head = null;
        DNode tail = null;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            DNode newDNode = new DNode(value);

            if (head == null) {
                head = newDNode;
                tail = newDNode;
            } else {
                tail.next = newDNode;
                newDNode.prev = tail;
                tail = newDNode;
            }
        }

        display(head);

        sc.close();
    }
}
