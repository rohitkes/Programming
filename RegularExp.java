import java.util.regex.*;
import java.util.*;

public class RegularExp {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		while(true){
			String s = in.nextLine();
			System.out.println(Pattern.matches("[-+]?[0-9]*.?[0-9]*", s));//false (m and a comes more than once)
		}
	}
}