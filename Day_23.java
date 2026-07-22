// Problem: Merge Two Sorted Linked Lists - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n
// - Second line: n space-separated integers (first list)
// - Third line: integer m
// - Fourth line: m space-separated integers (second list)

// Output:
// - Print the merged linked list elements, space-separated

// Example:
// Input:
// 5
// 10 20 30 40 50
// 4
// 15 25 35 45

// Output:
// 10 15 20 25 30 35 40 45 50

// Explanation:
// Compare nodes of both lists, append smaller to result, continue until all nodes are merged.

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

public class Day_23 {

    static Node merge(Node head1,Node head2){
        Node dummy = new Node(0);
        Node tail = dummy;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if(head1 != null)
            tail.next = head1;

        if(head2 != null)
            tail.next = head2;

        return dummy.next;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head1 = null;
        Node tail1 = null;

        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if(head1 == null){
                head1 = newNode;
                tail1 = newNode;
            }else{
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        int m = sc.nextInt();
        Node head2 = null;
        Node tail2 = null;

        for(int i = 0; i < m; i++){
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

        Node mergedHead = merge(head1,head2);

        Node temp = mergedHead;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }
}
