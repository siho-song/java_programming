package solved;

public class BinarySearchProblem {
	
	public static void Solution(int[] numbers , int target) {
		int left =0 ; 
		int right = numbers.length-1;
		int mid = (left+right)/2 ;
		
		boolean find = false;
		
		int temp = numbers[mid];
		
		while(left<=right) {
			if(temp == target) {
				find=true;
				break;
			}
			
			else if(temp > target) {
				right = mid-1;
			}
			
			else if(temp < target) {
				left = mid+1;
			}
			
			mid = (right +left ) / 2;
			temp = numbers[mid];
		}
		if(find == true) {
			System.out.println(mid);
		}
		else {
			System.out.println("찾는 수가 없습니다.");
		}
			
	}
	
	public static void main(String[] args) {
		int[] numbers = {12,25,31,48,54,66,70,83,95,108};
		Solution(numbers,89);
		

	}

}
