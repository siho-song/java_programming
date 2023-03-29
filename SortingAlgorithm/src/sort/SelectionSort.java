package sort;

public class SelectionSort extends Sort{

	public SelectionSort(int[] ary, String name) {
		super(ary, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] sort() {
		int temp;
		int index;
		
		for (i=0 ; i<size ;i++) {
			temp = ary[i];
			index=i;
			
			for(j=i; j<size; j++) {
				if(temp > ary[j]) {
					temp = ary[j];
					index = j;
				}
			}
			ary[index]= ary[i];
			ary[i] =temp;
			
		}
				
		return ary;
	}

}
