public class SortList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null ){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = null;

        ListNode left_side = sortList(head);
        ListNode right_side = sortList(slow);

        return mergeList(left_side,right_side);
    }


    static ListNode mergeList (ListNode l1 ,ListNode l2 ){

        ListNode ans = new ListNode(0);
        ListNode curr = ans;

        while( l1 !=null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if(l1 != null)curr.next = l1;
        else curr.next = l2;

        return ans.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(12);
        ListNode n5 = new ListNode(2);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode temp = sortList(n1);

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}