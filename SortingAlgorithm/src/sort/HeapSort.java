package sort;

public class HeapSort {
	private int SIZE;
	private int heapArr[];
	
	public HeapSort() {
		SIZE =0;
		heapArr = new int[50];
	}
	
	public void insertHeap(int input) {
		int i = ++SIZE;
		
		while(i != 1 && input<heapArr[i/2]) {
			heapArr[i] = heapArr[i/2];
			i = i/2 ;
		}
		heapArr[i] = input;
		
		
	}
	public void printHeap() {
		System.out.print("Min Heap : ");
		for(int i =1 ; i<=SIZE ; i++) {
			System.out.print("["+heapArr[i]+"] ");
		}
	}
	public int getHeapSize() {
		return SIZE;
	}
	
	private int deleteHeap() {
		int data = heapArr[1];
		int temp = heapArr[SIZE];
		SIZE -=1;
		int parent =1;
		int child = 2;
		
		while(child<=SIZE) {
			if((child<SIZE) && (heapArr[child] > heapArr[child+1])){
				child ++;
			}
			if(heapArr[child] >= temp) break;
			heapArr[parent] = heapArr[child];
			parent = child;
			child *= 2;
		}
		heapArr[parent] = temp;
		return data;
	}

	
	

	public static void main(String[] args) {
		HeapSort h = new HeapSort();
		h.insertHeap(80);
		h.insertHeap(50);
		h.insertHeap(70);
		h.insertHeap(10);
		h.insertHeap(60);
		h.insertHeap(20);
		
		h.printHeap();
		
		int n, data;
		n = h.getHeapSize();
		for(int i=1; i<=n ;i++) {
			data = h.deleteHeap();
			System.out.printf("\n 출력 : [%d]",data);
		}
	}
	

}
