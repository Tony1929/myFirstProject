package myproj.cav.prog.mycollections;

public class ListNode {
	
	Object data;
	ListNode next;
	
	
	public ListNode() {
		super();
	}
	
	
	public ListNode(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
}
