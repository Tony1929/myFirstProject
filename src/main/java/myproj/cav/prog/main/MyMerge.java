package myproj.cav.prog.main;

public class MyMerge {

	private int[] array;
	private int[] tempMergArr;
	private int length;

	public static void main(String a[]) {
		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		MyMerge mms = new MyMerge();
		mms.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);

		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		System.out.println("merge lowerIndex "+lowerIndex+" middle "+middle+" higherIndex "+higherIndex);
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
	    int j = middle + 1;
		int k = lowerIndex;
		
		while (i <= middle && j <= higherIndex) {
			System.out.println("compare "+tempMergArr[i]+" to "+tempMergArr[j]);
			if (tempMergArr[i] <= tempMergArr[j]) {
				System.out.println("Add "+tempMergArr[i]+" postion "+k);
				array[k] = tempMergArr[i];
				i++;
			} else {
				System.out.println("Add "+tempMergArr[j]+" postion "+k);
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}
	}

}
