package myproj.cav.prog.algorithams.search;

public class SearchService {
	
	String [] text;
	
	public SearchService() {
		super();
	}

	public SearchService(String[] text) {
		super();
		this.text = text;
	}

	public boolean binarySearch(String word){
		if(text.length == 0){
			return false;
		}
		int low = 0;
		int high = text.length -1;
		while(low <= high){
			int middle = (low+high) /2;
			if(word.compareTo(text[middle]) < 0){
				low = middle+1;
			} else if(word.compareTo(text[middle]) > 0){
				high = middle-1;
			} else{
				return true;
			}
		}
		return false;
	}

}
