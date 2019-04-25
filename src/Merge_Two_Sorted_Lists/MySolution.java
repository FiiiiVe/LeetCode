package Merge_Two_Sorted_Lists;

import org.w3c.dom.ls.LSException;

public class MySolution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(val);
            ListNode temp = next;
            while (temp != null) {
                sb.append("->").append(temp.val);
                temp = temp.next;
            }
            return sb.toString();
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode head = l1;
        while (l1.next != null && l2 != null) {
            if (l1.next.val < l2.val) {
                l1 = l1.next;
            } else {
                ListNode temp = new ListNode(l2.val);
                temp.next = l1.next;
                l1.next = temp;
                l2 = l2.next;
                l1 = l1.next;
            }
        }
        if (l1.next == null) {
            l1.next = l2;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        System.out.println(mergeTwoLists(l1, l2));
    }

}
