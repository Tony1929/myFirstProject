package myproj.cav.prog.main;

import myproj.cav.prog.algorithams.ShiftArray;

public class ShifterMain {

	public static void main(String[] args) {
		ShiftArray shift = new ShiftArray(1000000);
		long start1 = System.nanoTime();
		int [] arr1 = shift.shiftLeft1(500000);
		System.out.println("Copy Arrays          "+(System.nanoTime()- start1));
		shift = new ShiftArray(1000000);
		long start2 = System.nanoTime();
		int [] arr2 = shift.shiftLeft2(500000);
		System.out.println("Shift whole array by 1"+(System.nanoTime()-start2));
		System.out.println();
	}
	
	

}
