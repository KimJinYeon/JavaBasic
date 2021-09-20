package jump2java;
import java.io.InputStream;

public class StreamTest3 {
	public static void main(String[] args) throws Exception{
		InputStream in = System.in;
		
		byte[] a = new byte[3];
		in.read(a);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}
