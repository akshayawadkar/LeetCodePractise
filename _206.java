package com.leetcode;

public class _206 {
    public com.company.ListNode reverseList(com.company.ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        
        com.company.ListNode curr = head;
        com.company.ListNode prev = null;
        
        while(curr != null){
            
            com.company.ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp; 
        }
        
        return prev;
    }
}