import java.io.*;
import java.util.Scanner;

public class DemoString 
{
	public static void main( String[] args ) throws Exception 
	{
		Scanner in = new Scanner(System.in);
		String s1 = "Rohit";
		String s2 = " Kesarvani";

		String s3 = s1.concat(s2);
		System.out.println(s3);

		char[] bytes = {
							'R', 'o', 'h'
						};

		String s4 = new String(bytes);
		System.out.println(s4);
		String s5 = "Javatpoint";

		char ch = s3.charAt(s3.length()-1);
		System.out.println(ch);

		// s2.chatAt(0)
		//s2.length()
		System.out.println(String.format("String s4 is %s", s2));

	}
}