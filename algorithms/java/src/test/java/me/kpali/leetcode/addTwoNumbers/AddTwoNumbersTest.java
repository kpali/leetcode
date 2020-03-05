package me.kpali.leetcode.addTwoNumbers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    @Test
    public void addTwoNumbers() {
        List<ListNode> l1 = new ListNode();
        l1.add(new ListNode(2));
        l1.add(new ListNode(4));
        l1.add(new ListNode(3));
        List<ListNode> l2 = new ArrayList<ListNode>();
        l2.add(new ListNode(5));
        l2.add(new ListNode(6));
        l2.add(new ListNode(4));
        List<ListNode> actuals = addTwoNumbers.addTwoNumbers(l1, l2);

        List<ListNode> expectds = new ArrayList<ListNode>();
        Assert.assertArrayEquals(expectds.toArray(), actuals.toArray());
    }
}