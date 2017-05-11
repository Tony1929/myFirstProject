package myproj.cav.prog.algorithams;

public class StringAnagramer {

	String one;
	String two;
	
	public StringAnagramer() {
		super();
	}
	
	public StringAnagramer(String one, String two) {
		super();
		this.one = one;
		this.two = two;
	}
	
	public int charsToDelete(){
		int matcher = 0;
		for(int index=0; index < one.length(); index++){
			for(int jndex =0; jndex < two.length(); jndex++){
				if(one.charAt(index) == two.charAt(jndex)){
					matcher++;
				}
			}
		}
		return ((one.length() - matcher)+(two.length() - matcher));
		
	}
	
}
