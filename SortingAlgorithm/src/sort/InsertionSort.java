package sort;

public class InsertionSort extends Sort{

	public InsertionSort(int[] ary, String name) {
		super(ary, name);
	}
	
	@Override
	public int[] sort() {
		int temp;
		
		for(i=0; i<size; i++) {
			temp = ary[i];
			j=i;
			
			while(j>0 && ary[j-1] > temp) {
				ary[j] = ary[j-1];
				j--;
			}
			
			ary[j] = temp; 
		}
		
		return ary;
	}
	
}
