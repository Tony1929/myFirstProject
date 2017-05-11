package myproj.cav.prog.algorithams;

public class ShiftArray {
	
	int [] numbers = null;
	
	
	public ShiftArray() {
		super();
	}

	public ShiftArray(int size) {
		numbers = new int[size];
		for(int index = 0; index < size; index++){
			numbers[index] = index;
		}
	}

	public int [] shiftLeft1(int shift){
		int arrayLength = numbers.length-1;
		int temp [] = new int[shift];
		int tempIndex = shift-1;
		int tempPosition = (arrayLength-shift)+1;
		for(int index = arrayLength; index >= tempPosition; index--){
			temp[tempIndex] = numbers[index];
			tempIndex--;
		}
		int shiftIndex = numbers.length - shift;
		for(int index = shiftIndex-1; index >= 0 ;index--){
			numbers[arrayLength] = numbers[index];
			arrayLength--;
		}
		for(int index = 0; index < shift; index++){
			numbers[index] = temp[index];
		}
		return numbers;
	}
	
	public int[] shiftLeft2(int shift) {
		int arrayLength = numbers.length -1;
		int temp =0;
		for(int shiftIndex = 0; shiftIndex < shift; shiftIndex++){
			for (int index = arrayLength ; index > 0; index--) {
				if(index == arrayLength){
					temp = numbers[index];
				}
				numbers[index] = numbers[index-1];
			}
			numbers[0] = temp;
		}
		return numbers;
	}
	
	public int[] shiftRight(int shift) {
		for(int shiftIndex = 0; shiftIndex < shift-1; shiftIndex++){
			for (int i = 0, start = 0; i < numbers.length; i++) {
				if (i == 0) {
					start = numbers[i];
				}
				if (i == (numbers.length - 1)) {
					numbers[i] = start;
					break;
				}
				numbers[i] = numbers[i + 1];
			}
		}
		
		return numbers;
	}

}
