package DSA.day02;

public class LinkedLists<E>{

     Node head = null;

     class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(Node head){
        if(head == null){
            return;
        }

        Node currNode = head;

        while(currNode != null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }
}
