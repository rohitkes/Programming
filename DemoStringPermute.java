import java.util.*;
import java.io.*;

class StringPermute {
    
    public void permute(char[] input) {
       Map<Character, Integer> countMap = new TreeMap<>();
       for(char ch : input) {
           if(countMap.get(ch) == null) {
               countMap.put(ch,1);
           } else {
               countMap.put(ch, countMap.get(ch) + 1);
           }
       }
       
       char[] str = new char[countMap.size()];
       int[] count = new int[countMap.size()];
       char[] result = new char[input.length];
       
       int index = 0;
       for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
           str[index] = entry.getKey();
           count[index] = entry.getValue();
           index++;
       }
       permuteUtil(str,count,result,0);
    }
    
    public void permuteUtil(char[] str, int[] count, char[] result, int level) {
        if(level ==result.length) {
            printPermutation(result);
            return;
        }
        
        for(int i = 0; i < str.length; i++) {
            if( count[i] == 0) {
                continue;
            } 
            result[level] = str[i];
            count[i]--;
            permuteUtil(str,count,result,level+1);
            count[i]++;
        }
    }
    
    public void printPermutation(char[] result) {
        for(char ch: result) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
public class DemoStringPermute {
    
    public static void main(String[] args) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String inp = br.readLine();
        System.out.println();
    
        char[] input = inp.toCharArray();
        
        StringPermute sp = new StringPermute();
        sp.permute(input);
    
   		
    }
    
}
