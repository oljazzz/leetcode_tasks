package medium;

import java.util.HashSet;

public class RemoveDuplicatesFromLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        int currenValue = head.val;
        if (head.next.val == currenValue) {
            while (head.val == currenValue) {
                head = head.next;
                if (head == null) return null;
            }
            head = deleteDuplicates(head);
        } else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));

        RemoveDuplicatesFromLinkedList t = new RemoveDuplicatesFromLinkedList();
        ListNode res = t.deleteDuplicates(listNode);

    }

}
