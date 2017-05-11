package myproj.cav.prog.main;

import myproj.cav.prog.algorithams.search.SearchService;

public class SearchServiceMain {

	public static void main(String[] args) {
		String text [] = {"One", "Two", "Three", "Four", "Five", "Six", "Severn", "eight", "nine"};
		SearchService service = new SearchService(text);
		boolean found = service.binarySearch("Four");
		System.out.println(found);
	}

}
