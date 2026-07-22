// Problem: Delete First Occurrence of a Key - Implement using linked list with dynamic memory allocation.

// Input:
// - First line: integer n
// - Second line: n space-separated integers
// - Third line: integer key

// Output:
// - Print the linked list elements after deletion, space-separated

// Example:
// Input:
// 5
// 10 20 30 40 50
// 30

// Output:
// 10 20 40 50

// Explanation:
// Traverse list, find first node with key, remove it by adjusting previous node's next pointer.

//Solution

import java.util.*;

class Node{
    int data;
    Node next;
    
    Node(int value){
        this.data = value;
        this.next = null;
    }
}

public class Day_24 {

    public static Node delete(Node head, int key){
        if(head == null)
            return null;

        if(head.data == key)
            return head.next;

        Node current = head;
        Node prev = null;

        while(current != null && current.data != key){
            prev = current;
            current = current.next;
        }

        if(current != null){
            prev.next = current.next;
        }

        return head;
    }


    public static void main(String[] args) {
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

        int key = sc.nextInt();

        head = delete(head,key);

        Node temp = head;
        while( temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        sc.close();
    }
}
