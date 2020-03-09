package me.kpali.leetcode.addTwoNumbers;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    @Test
    public void addTwoNumbers1() {
        ListNode current;
        ListNode next;

        ListNode l1 = new ListNode(2);
        current = l1;
        next = new ListNode(4);
        current.next = next;
        current = current.next;
        next = new ListNode(3);
        current.next = next;

        ListNode l2 = new ListNode(5);
        current = l2;
        next = new ListNode(6);
        current.next = next;
        current = current.next;
        next = new ListNode(4);
        current.next = next;

        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);

        int[] actuals = new int[3];
        current = actual;
        actuals[0] = current.val;
        current = current.next;
        actuals[1] = current.val;
        current = current.next;
        actuals[2] = current.val;
        int[] expectds = new int[3];
        expectds[0] = 7;
        expectds[1] = 0;
        expectds[2] = 8;
        Assert.assertArrayEquals(expectds, actuals);
    }

    @Test
    public void addTwoNumbers2() {
        ListNode current;
        ListNode next;

        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);

        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);

        int[] actuals = new int[2];
        current = actual;
        actuals[0] = current.val;
        current = current.next;
        actuals[1] = current.val;
        int[] expectds = new int[2];
        expectds[0] = 0;
        expectds[1] = 1;
        Assert.assertArrayEquals(expectds, actuals);
    }
}