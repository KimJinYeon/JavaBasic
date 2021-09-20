package jump2java;
import java.io.InputStream;

public class StreamTest2 {
	public static void main(String[] args) throws Exception{
		InputStream in = System.in;
		
		int a;
		int b;
		int c;
		
		a = in.read();
		b = in.read();
		c = in.read();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
