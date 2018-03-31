import java.util.*;

public class DemoNonRepeating {

	public  static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < n; i++) {
			if(map.get(a[i]) == null) {
				map.put(a[i], 1);
			} else {
				map.put(a[i], map.get(a[i]) + 1 );
			}
		}

		for(Map.Entry<Integer, Integer> mp : map.entrySet()) {
			if(mp.getValue()==1) {
				System.out.println(mp.getKey());
				break;
			}
		}
	}
 
 }