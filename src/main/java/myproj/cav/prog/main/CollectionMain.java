package myproj.cav.prog.main;

import myproj.cav.prog.mycollections.ListIterator;
import myproj.cav.prog.mycollections.MyLinkList;

public class CollectionMain {

	public static void main(String[] args) {
		MyLinkList list = new MyLinkList();
		list.add("Tony");
		list.add("Mark");
		list.add("Paul");
		list.add("Peter");
		list.add("Simon");
		list.add("John");
		
		ListIterator iter = list.iterator();
		
		System.out.println(list.hasCycle());
		
		while(iter.hasNext()){
			System.out.println(iter.next().toString());
		}
		System.out.println("*************************");
		System.out.println("Remove "+list.removeFirst());
		System.out.println("*************************");
		iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().toString());
		}
		System.out.println("*************************");
		System.out.println("Remove "+list.removeLast());
		System.out.println("*************************");
		iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().toString());
		}

	}

}
