public class DemoRemoveDuplicate {

	public static void main(String[] args) throws Exception {

		java.util.Scanner in = new java.util.Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		int j = 1;

		for(int i = 1; i < n; i++) {
			if(a[i]==a[i-1]) {
				continue;
			}
			a[j] = a[i];
			j++;
		}

		for(int i = 0; i < j; i++) {
			System.out.print(a[i]);
		}
	}

}