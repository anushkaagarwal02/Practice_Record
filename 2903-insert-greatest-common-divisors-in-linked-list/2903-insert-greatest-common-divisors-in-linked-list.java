/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {   
        ListNode curr=head;
           if (curr == null ||curr.next == null) {
            return curr;
        }
        ListNode temp=head;
        
        while (temp!= null && temp.next != null) 
        {  
            int a=temp.val;
        int b=temp.next.val;
       
        int gcd=gcd(a,b);
        ListNode n=new ListNode(gcd);
       
            n.next=temp.next;
            temp.next=n;
            temp=n.next;
        }
        return curr;
    }
    public static int gcd(int a,int b)
    { int r=0;
        while(b!=0)
        {
            r=a%b;
           
            a=b;
             b=r;
        }
        return a;
}
}


