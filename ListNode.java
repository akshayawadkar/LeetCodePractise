package com.leetcode;

public class ListNode {

    int val;
    com.company.ListNode next;

    ListNode(){

    }

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, com.company.ListNode next){
        this.val = val;
        this.next = next;
    }

    public static com.company.ListNode getList(int[] arr) {
        com.company.ListNode head = new com.company.ListNode(-1);
        com.company.ListNode curr = head;

        for(int i : arr){
            curr.next = new com.company.ListNode(i);
            curr = curr.next;
        }

        return head.next;
    }

    public static void display(com.company.ListNode head){

        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }

    }





}
