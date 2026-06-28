public class LL82
{
    public ListNode deleteDuplicates(ListNode head)
    {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null)
        {
            if (prev.next.val == prev.next.next.val)
            {
                int dupVal = prev.next.val;
                while (prev.next != null && prev.next.val == dupVal)
                {
                    prev.next = prev.next.next;
                }
            }
            else
            {
                prev = prev.next;
            }
        }
        return dummy.next;
    }
}
