public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode reference = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;

            int value = sum % 10;
            carry = sum / 10;

            ListNode tempNode = new ListNode();
            tempNode.val = value;

            head.next = tempNode;
            head = tempNode;
        }

        return reference.next;
    }

}
