package myproj.cav.prog.main;

import myproj.cav.prog.algorithams.StringAnagramer;

public class Anagrammer {

	public static void main(String[] args) {
		StringAnagramer anagrammer = new StringAnagramer("cde","abc");
		System.out.println(anagrammer.charsToDelete());

	}

}
