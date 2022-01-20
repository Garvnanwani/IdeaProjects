package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int val) {
        data = val;
        next = null;
    }
}

public class LinkedList {

    Node head;

    void addLast(int data) {
        Node temp = head;

        if (head == null) {
            temp = new Node(data);
            head = temp;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);

    }

    int size() {
        int size = 0;

        if (head == null) {
            return size;
        }

        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(5);
        System.out.println(ll.size());
    }
}
