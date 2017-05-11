package myproj.cav.prog.mycollections;

import java.util.NoSuchElementException;

public class ListIterator {

	private ListNode nextNode;
	private ListNode previousNode;
	private ListNode currentNode;
	
	
	public ListIterator() {
		super();
	}

	public ListIterator(ListNode nextNode) {
		super();
		this.nextNode = nextNode;
	}

	public boolean hasNext(){
		if(nextNode != null){
			return true;
		}
		return false;
	}
	
	public Object next(){
		if (!this.hasNext ()){
            throw new NoSuchElementException (
                                "end of the iteration");
		}
		Object obj = nextNode.getData();
        nextNode = nextNode.getNext();
        return obj;
	}
	
	
}
