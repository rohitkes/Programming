import java.util.Scanner;


public class DemoNumeric
{
	public static void main( String[] args ) throws Exception 
	{

		Scanner in = new Scanner(System.in);
		String input = in.readLine();
		input = input.toLowerCase();
		while( i < input.length() ) 
		{
			char ch = input.charAt(i);
			if( i == 0 && ( ch == '+' || ch == '-' ))
			{
				i++;
				continue;
			}

			if( ch == '.' )
			{
				countDot ++;
				if(countDot>1)
					isNumeric = false;
			}
			else if( (ch >= '0' && ch <= '9') || ch
		}
	}
}