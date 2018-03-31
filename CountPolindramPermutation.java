import java.util.*;
import java.io.*;

public class CountPolindramPermutation
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String buff = br.readLine();

		int[] v = new int[26];

		for(int i = 0; i < 26; i++) v[i] = 0;
		for(int i = 0; i < buff.length(); i++ )
		{
			int x = (int)buff.charAt(i) - 97;
			v[x]++;
		}

		int count = 0, sum = 0, denom = 1, index = -1;
		for(int i = 0; i < 26; i++)
		{
			if(v[i]%2==1)
			{
				count++;
				index = i;
			}
		}
		int c = 0;

		if(count>1)
		{
			System.out.println("Not Possible");
		}  
		else
		{
			for(int i = 0; i < 26; i++)
			{
				if(i != index)
				{
					sum += v[i]/2;
					denom *= fact(v[i]/2);
					
				}
				else if(index !=-1)
				{
					sum += (v[i]-1)/2;
					denom *= fact((v[i]-1)/2);
				}
			}
			
			System.out.println(fact(sum)/denom);
		}

	}

	static int fact(int n)
	{
		if(n==1 || n==0)
			return 1;
		else 
			return n * fact(n-1);

	}
} 