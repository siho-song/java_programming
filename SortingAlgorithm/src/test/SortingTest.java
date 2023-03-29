package test;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;
import sort.Sort;

public class SortingTest {

	public static void main(String[] args) {
		int[] ary = {4,5,10,2,33,13,24,46};
		Sort bubSort = new BubbleSort(ary,"Bubble Sort");
		bubSort.sort();
		bubSort.printSortingAry();
		
		int[] ary2 = {4,5,10,2,33,13,24,46};
		Sort insSort = new InsertionSort(ary2, "Insertion Sort");
		insSort.sort();
		insSort.printSortingAry();
		
		int[] ary3 = {4,5,10,2,33,13,24,46};
		Sort selcSort= new SelectionSort(ary3, "Selection Sort");
		selcSort.sort();
		selcSort.printSortingAry();
		
		
	}

}
