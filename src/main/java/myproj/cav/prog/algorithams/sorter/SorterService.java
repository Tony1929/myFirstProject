package myproj.cav.prog.algorithams.sorter;

public class SorterService {
	
	 private String [] mergeDataToSort = null;
	 private String [] tempData = null;
	 int dataLength = 0;
	
	public String [] quickSort(String [] data){
		String array[]; 
		int length;
		if(data == null || data.length == 0){
			return data;
		}
		array = data;
		length = data.length;
		return quickSort(0, length-1, array);
	}
	
	public String [] bubbleSort(String [] data){
		for(int index=0; index < data.length; index++){
			for(int jndex = 1; jndex < (data.length - index); jndex++){
				//If Element on left bigger than right swap
				if(data[jndex-1].compareTo(data[jndex]) > 0){
					String temp = data[jndex - 1];
	                data[jndex-1] = data[jndex];
	                data[jndex] = temp;
				}
			}
		}
		return data;
	}
	
	private String [] quickSort(int lowerIndex, int higherIndex, String [] array) { 
		int i = lowerIndex; int j = higherIndex; 
		// calculate pivot number, I am taking pivot as middle index number 
		String pivot = array[lowerIndex+(higherIndex-lowerIndex)/2]; 
		// Divide into two arrays 
		
		while (i <= j) { 
			// In each iteration, 
			// 1) Identify a String from left side which is greater then the pivot value, 
			while (pivot.compareTo(array[i]) > 0) { 
				//Left String is less than pivot
				i++; 
			} 
			// 2) Identify a number from right side which is less then the pivot value. 
			while (pivot.compareTo(array[j]) < 0) {
				//Left String is greater than pivot
				j--; 
			} 
			if (i <= j) { 
				// 3) Once the search  is done, then we exchange both numbers.
				exchangeStrings(i, j, array); 
				//move index to next position on both sides 
				i++; j--; 
			} 
		}
		// call quickSort() method recursively 
	    if (lowerIndex < j) {
	    	quickSort(lowerIndex, j, array); 
	    }
	    if (i < higherIndex) {
	    	quickSort(i, higherIndex, array); 
	    } 
		return array;
	}
	
	public String [] mergeSort(String [] data){
		mergeDataToSort = data;
		tempData = new String[data.length];
		doMerge(0, data.length-1);
		return this.mergeDataToSort;
	}

	private void exchangeStrings(int i, int j, String [] array) {  
		String temp = array[i]; 
		array[i] = array[j]; 
		array[j] = temp; 
	}
	
	private void doMerge(int lowerIndex, int higherIndex){
		if(lowerIndex < higherIndex){
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2; 
			//Sort the left
			doMerge(lowerIndex, middle);
			//sort the right
			doMerge(middle+1, higherIndex);
			merge(lowerIndex, middle, higherIndex);
		}
	}
	
	private void merge(int lowerIndex, int middle,  int higherIndex){
		for(int index=lowerIndex; index <= higherIndex;  index++){
			tempData[index] = mergeDataToSort[index];
		}
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		while(i <= middle && j <= higherIndex){
			System.out.println("Compare "+tempData[i]+" To "+tempData[j]);
			if(tempData[i].compareTo(tempData[j]) <= 0){
				System.out.println("Add "+tempData[i]+" position "+k);
				mergeDataToSort[k] = tempData[i];
				i++;
			} else {
				System.out.println("Add "+tempData[j]+" position "+k);
				mergeDataToSort[k] = tempData[j];
				j++;
			}
			k++;
		}
		while(i <= middle){
				mergeDataToSort[k] = tempData[i];
				k++;
			i++;
		}
	}

}
