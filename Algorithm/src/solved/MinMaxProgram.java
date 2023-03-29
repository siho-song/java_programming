package solved;

public class MinMaxProgram {
	
	public static void Solution(int[] ary) {
		int min = ary[0];
		int max = ary[0];
		int minIndex =0 ;
		int maxIndex =0;
		
		for(int i =1; i<ary.length;i++) {
			
			if(ary[i] >= max) {
				max = ary[i];
				maxIndex = i;
			}
			
			if(ary[i] <= min) {
				min = ary[i];
				minIndex= i;
			}
			
		}
		System.out.println("max : " + max + ", maxIndex : " + maxIndex);
		System.out.println("min : " + min + ", minIndex : " + minIndex);
		
	}
			

	public static void main(String[] args) {
		int[] ary = {10,55,23,2,79,101,16,82,39,45};
		Solution(ary);

	}

}
