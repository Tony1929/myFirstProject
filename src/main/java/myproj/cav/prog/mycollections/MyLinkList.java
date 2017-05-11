package myproj.cav.prog.mycollections;

public class MyLinkList {

	private ListNode head;
	int count;
	
	public MyLinkList() {
		super();
		count = 0;
	}

	public void add(Object value){
		ListNode newNode = new ListNode(value);
		if(head == null){
			head = newNode;
		} else {
			ListNode currentNode = head;
			while(currentNode.getNext() != null){
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
	}
	
	public Object removeFirst(){
		Object value = head.getData();
		head = head.getNext();
		return value;
	}
	
	public Object removeLast(){
		ListNode currentNode = head;
		while(currentNode.getNext() != null){
			currentNode = currentNode.getNext();
		}
		Object value = currentNode.getData();
		currentNode = null;
		return value;
	}
	
	public boolean hasCycle(){
		return hasCycle(head);
	}
	
	private boolean hasCycle(ListNode head){
		if(head == null){
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.getNext();
		while(slow != fast) {
			if(fast == null || slow == null){
				return false;
			}
			slow = slow.getNext();
			fast = fast.getNext();
		}
		return true;
	}
	
	public ListIterator iterator(){
		return new ListIterator(head);
	}
}
