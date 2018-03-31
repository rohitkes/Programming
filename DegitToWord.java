public class DegitToWord  {
	
	public static void main(String[] args) throws Exception  {

		java.util.Scanner in = new java.util.Scanner(System.in);

		String[] one_degit = {
				"","one ", "two ", "three ", "four " , "five " , "six " , "seven " , "eight ", "nine ", 
					"ten ", "eleven ", "twelve ", "thirteen ", "fourteen ",

                     "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};

        String[] tens_multiple = {"", "", "twenty ", "thirty ", "forty ", "fifty ",
                             "sixty ", "seventy ", "eighty ", "ninety "};
 
    	String[] tens_power = {"hundred ", "thousand ","lakh ","crore "};

    	while(true) {

	    	int number = in.nextInt();
	    	int x = number, p, q;
	    	String ans = "";
	    	
	    	if(x==0) {
	    		ans = "zero";
	    	}
	    	int i = 0;
	    	while(x!=0)
	    	{
	    		if(i == 0) {
	    			
	    			p = (x%1000)/100;
	    			q = x%100;
	    			x /= 1000;

	    			if(q<20) {
	    				ans = one_degit[q];
	    			} else {
	    				ans = tens_multiple[q/10] + one_degit[q%10];
	    			}
	    		
	    		} else  {

	    				p = x%100;
	    				x= x/100;
	    		}

	    		if(p!=0) {
	    			if(p<20) {
	    				ans = one_degit[p] + tens_power[i] + ans;
	    			} else {
	    				ans = tens_multiple[p/10] + one_degit[p%10] + tens_power[i] + ans;	
	    			}
	    		}
	    		i++;

	    	}
			
	    	System.out.println(ans);
	    }
	}

}