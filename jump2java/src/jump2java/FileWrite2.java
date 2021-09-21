package jump2java;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite2 {
	public static void main(String[] args) throws IOException{
		FileOutputStream output = new FileOutputStream("output/out2.txt");
		for(int i=0; i<11; i++) {
			String data = i + "번째 줄입니다. \r\n";
			output.write(data.getBytes());
		}
		output.close();
	}
}