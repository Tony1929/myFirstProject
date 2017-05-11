package myproj.cav.prog.main;



import java.io.IOException;
import java.io.InputStream;

import myproj.cav.prog.algorithams.WordFinder;

public class WordFinderMain {

	public static void main(String[] args) throws IOException {
		WordFinder wf = new WordFinder();
		InputStream stream = WordFinderMain.class.getResourceAsStream("/data/data.txt");
		long start1 = System.nanoTime();
		wf.streamAndFind(stream, "Schnitzly Milo is a ideologue and a rank opportunist", 9);
		System.out.println("Stream and find  "+(System.nanoTime()- start1));
		
		long start2 = System.nanoTime();
		wf.streamThenFind(stream, "Schnitzly Milo is a ideologue and a rank opportunist", 9);
		System.out.println("Stream then find "+(System.nanoTime()- start2));

	}

}
