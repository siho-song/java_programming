package sort;

public class BubbleSort extends Sort{

	
	public BubbleSort(int[] ary, String name) {
		super(ary,name);
	}
	
	@Override
	public int[] sort() {
		int temp;
		for(i=0; i<size; i++) {
			for(j=0 ; j<size-i-1; j++) {
				if(ary[j] > ary[j+1]) {
					temp =ary[j+1];
					ary[j+1] = ary[j];
					ary[j] = temp;
				}
			}
		}
		return ary;
	}
	
}
