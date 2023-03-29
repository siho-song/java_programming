package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemTest1 {
	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 [enter]키를 누르세요");
		int i;
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			while((i=isr.read()) != '\n') {;
//				System.out.println(i);
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
