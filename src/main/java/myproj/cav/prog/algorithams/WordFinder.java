package myproj.cav.prog.algorithams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WordFinder {
	
	private static final char SPACE = ' ';

	public String streamAndFind(InputStream stream, String string, int size) throws IOException{
		String[] checkWords = extractWords(string, size);
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		String line = null;
		int match = 0;
		if((line = reader.readLine())!= null){
			String [] text = extractWords(line, (line.length()/ 5));
			match = findWords(checkWords, text, match);
			if(match >= checkWords.length){
				return "yes";
			}
		}
		return "no";
	}
	
	public String streamThenFind(InputStream stream, String string, int size) throws IOException{
		String[] checkWords = extractWords(string, size);
		String text = streamText(stream);
		String[] words = extractWords(text, (text.length()/5));
		int match = 0;
		match = findWords(checkWords, words, match);
		if(match >= checkWords.length){
			return "yes";
		}
		return "no";
	}
	
	private String streamText(InputStream stream) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		String line = null;
		StringBuilder sb = new StringBuilder();
		if((line = reader.readLine())!= null){
			sb.append(line);
		}
		return sb.toString();
	}
	
	private String [] extractWords(String line, int wordAmount){
		String words [] = new String [wordAmount];
		char word [] = new char[22];
		int wordIndex = 0;
		int wordsIndex = 0;
		for(int index=0; index <= line.length()-1; index++){
			if(SPACE == line.charAt(index)){
				words[wordsIndex] = String.copyValueOf(word).trim();
				wordsIndex++;
				wordIndex = 0;
				word = new char[22];
			} else {
				word[wordIndex] = line.charAt(index);
				wordIndex++;
			}
		}
		words[wordsIndex] = String.copyValueOf(word).trim();
		return words;
	}
	
	private int findWords(String [] words, String [] text, int match){
		for(int index =0; index <= words.length-1; index++){
			for(int jndex=0; jndex <= text.length -1; jndex++){
				if(words[index].equals(text[jndex])){
					match++;
				}
			}
		}
		return match;
	}
}
