public class MaxLengthBitonicSuarray {
	
	public  static void main(String[] args) throws Exception {

		java.util.Scanner in = new java.util.Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = in.nextInt();

		int[] inc = new int[n];
		int[] dec = new int[n];



		java.util.Arrays.fill(inc,1);
		java.util.Arrays.fill(dec,1);

		for(int i = 1; i < n; i++) {
			inc[i] = a[i] >= a[i-1] ? inc[i-1] + 1: 1; 
		}

		for(int i = n-2; i >= 0; i--) {
			dec[i] = a[i] >= a[i+1] ? dec[i+1] + 1 : 1;
		}

		
		int max = -1, value, index = -1;
		for(int i = 0; i < n; i++) {
			value = dec[i] + inc[i] - 1;
			if(max < value ) {
				max = value;
				index = i;
			}
		}
		
		
		for(int i = index - inc[index] + 1; i <= index; i++ ) {
			System.out.print(a[i]+ " ");
		}

		for(int i = index + 1; i < index + dec[index] ; i++ ) {
			System.out.print(a[i]+ " ");
		}
	}

}