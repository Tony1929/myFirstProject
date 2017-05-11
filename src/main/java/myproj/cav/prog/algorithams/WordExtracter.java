package myproj.cav.prog.algorithams;

public class WordExtracter {
	
	private final static char SPACE = ' ';
	
	public String [] extractWords(String text, int size){
		String [] wordContainer = new String[size]; 
		String [] newWordContainer = null;
		char [] word = new char[20];
		int wordContainerIndex = 0;
		int wordIndex = 0;
		for(int index=0; index < text.length(); index++){
			if(SPACE == text.charAt(index)){
				if(wordContainer.length == wordContainerIndex){
					size = size + size;
					newWordContainer = new String[size];
					System.arraycopy(wordContainer, 0, newWordContainer, 0, wordContainer.length);
					wordContainer = newWordContainer;
				}
				wordContainer[wordContainerIndex] = String.copyValueOf(word);
				wordContainerIndex++;
				word = new char[20];
				wordIndex = 0;		
			} else {
				if(Character.isLetter(text.charAt(index)) ){
					word[wordIndex] = text.charAt(index);
					wordIndex++;
				}
			}
		}
		return wordContainer;
	}

}
