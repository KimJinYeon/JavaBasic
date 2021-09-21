package jump2java;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException{
		FileOutputStream output = new FileOutputStream("output/out1.txt");
		output.close(); // ÆÄÀÏ °´Ã¼ ´Ý±â
	}
}