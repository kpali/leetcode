package me.kpali.leetcode.addTwoNumbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return this.addRecursion(l1, l2, 0);
    }

    private ListNode addRecursion(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        int sum = 0;
        if (l1 == null && l2 == null) {
            sum = carry;
        } else {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            sum = v1 + v2 + carry;
        }
        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;
        ListNode next = this.addRecursion(next1, next2, sum / 10);
        ListNode result = new ListNode((sum) % 10);
        if (next != null) {
            result.next = next;
        }
        return result;
    }
}
