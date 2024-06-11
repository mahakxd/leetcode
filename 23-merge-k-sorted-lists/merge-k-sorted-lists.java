class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode cur = head;
        
        ListNode minNode = null;
        boolean isAllNull = true;
        int minIndex = 0;
        
        while(true) {
            // traverse the lists, find the min node;
            for (int i = 0; i < lists.length; i++) {
                ListNode node = lists[i];
                
                // this is our while loop stop condition, if we find at least 1 node is not null isAllNull=false;
                if (node == null) continue;
                isAllNull = false;
                
                // checking min
                if (minNode == null || node.val < minNode.val) {
                    minNode = node;
                    minIndex = i;
                }
            }
            
            if (isAllNull) break; // check the stop condition
            
            // add min node to cur node, shift the min node in the lists
            lists[minIndex] = lists[minIndex].next;
            cur.next = minNode;
            cur = cur.next;
            
            minNode = null; // reset min node
            isAllNull = true; // reset the stop condition
        }
        
        return head.next;
    }
}