// Problem: Count Occurrences of an Element in Linked List - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n (number of nodes)
// - Second line: n space-separated integers (linked list elements)
// - Third line: integer key (element to be counted)

// Output:
// - Print the number of times the key appears in the linked list

// Example:
// Input:
// 6
// 10 20 30 20 40 20
// 20

// Output:
// 3

// Explanation:
// Traverse the linked list from head to end. Each time a node's data matches the given key, increment a counter. After traversal, print the final count.

//Solution 

import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int value){
        this.data = value;
        this.next = null;
    }
}
public class Day_25 {

    public static int Count(Node head, int m){
        int count = 0;
        Node temp = head;

        while(temp != null){
            if(temp.data == m){
                count++;
            }

            temp = temp.next;
        }

        return count;

    }

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

        System.out.println(Count(head, m));

        sc.close();
    }
    
}
