package ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {

	public static void main(String[] args) {
		try(FileWriter fw= new FileWriter("writer.txt")){
			char[] ch = {'안','녕','하','세','요'};
			fw.write(ch);
			fw.write("안녕하세요 저는 John입니다.");
			fw.write(65);
			fw.write("65");
			fw.write(ch,1,3);
			
 		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
