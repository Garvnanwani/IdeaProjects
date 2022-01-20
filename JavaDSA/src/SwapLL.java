public class SwapLL {
    public static void main(String[] args) {
        Node n1 = new Node(5);
        n1.next = new Node(6);
        n1.next.next = new Node(7);
        n1.next.next.next = new Node(8);
        n1.next.next.next.next= new Node(9);
        n1.next.next.next.next.next = new Node(10);

        Swap(n1);

        Node temp = n1;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void Swap(Node head) {
        if(head == null ) {
            return;
        }

        Node temp = head;
        Node tempNext = temp.next;
        temp.next = temp.next.next;
        tempNext.next = temp;

        Swap(temp.next);
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
