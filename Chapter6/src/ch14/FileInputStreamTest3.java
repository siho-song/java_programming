package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		byte[] bs = new byte[10];
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			int i;
//			while((i=fis.read(bs)) != -1) {
////				enhanced for 를 썼을때 ? 버퍼에 남아있는 자료까지 다 읽어들이는 경우가 발생할 수 있어서 읽은만큼 출력하는게 좋다.
//				for(int k=0 ; k<i ;k++) {
//					System.out.print((char)bs[k]);
//				}
//				System.out.println(":"+i+"바이트 읽음");
//			}
			while((i=fis.read(bs, 1, 9)) != -1) {
				for(int k=0 ;k<i ; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(":"+i+"바이트 읽음");
			}
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
