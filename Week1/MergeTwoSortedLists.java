public class MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(4);
		
		node1.next = node2;
		node2.next = node3;
		
		ListNode nodeA = new ListNode(1);
		ListNode nodeB = new ListNode(3);
		ListNode nodeC = new ListNode(4);
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		
		ListNode x = mergeTwoLists(node1,nodeA);
		while (x != null) {
			System.out.println(x.val);
			x = x.next;
		}
	}
		
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode mergedList = new ListNode(0);
		ListNode tail = mergedList;
		
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				ListNode newNode = new ListNode(list1.val);
				tail.next = newNode;
				tail = tail.next;
				list1 = list1.next;				
			}else {
				ListNode newNode = new ListNode(list2.val);
				tail.next = newNode;
				tail = tail.next;
				list2 = list2.next;	
			}
		}
		if (list1 == null) {
			tail.next = list2;
		} else {
			tail.next = list1;
		}
		return mergedList.next;
	}	
}

public class ListNode {
	int val;
	ListNode next;
		
	ListNode() {
		
	}
		
	ListNode(int val) {
		this.val = val;
	}
		
	ListNode(int val, ListNode next) {
		this.val = val; this.next = next;
	}	
}
