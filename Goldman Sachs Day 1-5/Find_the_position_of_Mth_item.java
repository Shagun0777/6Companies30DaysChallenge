//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);
            int K = Integer.parseInt(S[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.findPosition(N,M,K));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int n , int m , int k) {
        // code here
      if (m <= n - k + 1)
            return m + k - 1;
         m = m - (n - k + 1);
          return (m % n == 0) ? n : (m % n);
        
    }
};