import java.io.*;
import java.util.*;

public class DemoArrayList {

	public static void main(String[] args) throws Exception {

		ArrayList<Integer> list = new ArrayList<Integer>();
							list.add(3);
							list.add(10);
							list.add(32);
							list.add(2);
							

					Iterator itr = list.iterator();

					while(itr.hasNext()) {
						System.out.println(itr.next());
					}
	}
}