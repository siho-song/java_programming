package sort;

public abstract class Sort {
	
	public int size;
	public int[] ary;
	public int i,j;
	public String name;
	
	public Sort(int[] ary , String name) {
		this.size = ary.length;
		this.ary =ary;
		this.name =name;
	}
	
	public abstract int[] sort();
	
	public void printSortingAry() {
		System.out.print(name+" : ");
		for(int i : ary) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
}
