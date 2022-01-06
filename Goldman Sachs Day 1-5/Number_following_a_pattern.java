//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String printMinNumberForPattern(String str){
        // code here
       String ans="";
        int i = 0;
        int cur = 1; 
        int dCount = 0; 
        while (i < str.length()) {
 
            char ch = str.charAt(i);
            if (i == 0 && ch == 'I') {
                ans += cur;
                cur++;
            }
            if (ch == 'D') {
                dCount++;
            }
 
            int j = i + 1; 
            while (j < str.length()
                   && str.charAt(j) == 'D') {
                dCount++;
                j++;
            }
 
            int k = dCount;  
            while (dCount >= 0) {
                ans += (cur + dCount);
                dCount--;
            }
 
            cur += (k + 1); 
            dCount = 0;
            i = j;
        }
        return ans;
    }
}
