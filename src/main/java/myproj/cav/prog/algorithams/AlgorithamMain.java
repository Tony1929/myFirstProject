package myproj.cav.prog.algorithams;

import java.io.IOException;
import java.io.InputStream;

import myproj.cav.prog.algorithams.sorter.SorterService;
import myproj.cav.prog.reader.ResourceReader;

public class AlgorithamMain {

	public static void main(String[] args) throws IOException {
		InputStream stream = AlgorithamMain.class.getResourceAsStream("/data/data.txt");
		ResourceReader reader = new ResourceReader();
		String text = reader.readStreamIntoString(stream);
		WordExtracter extracter = new WordExtracter();
		String [] words = extracter.extractWords(text, 6418);
		SorterService sorter = new SorterService();
		String [] words1 = extracter.extractWords(text, 6418);
		long start2 = System.nanoTime();
		words1 = sorter.bubbleSort(words1);
		System.out.println("Bubble Sort took "+(System.nanoTime()-start2));
		
		long start1 = System.nanoTime();
		words = sorter.quickSort(words);
		System.out.println("Quick  Sort took "+(System.nanoTime()-start1));
		
		String [] data = new String [] {"Tony", "Mark", "Shay", "Paul","Tom"} ;
		data = sorter.mergeSort(data);
		
		System.out.println();
		
	}

}
