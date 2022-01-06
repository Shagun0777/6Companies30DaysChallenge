//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.decodedString(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        // code here
        ArrayList<Character> a = new ArrayList<Character>();
         
        for(int i = 0; i < s.length(); i++)
        {
          
            if (s.charAt(i) == ']')
            {
                String temp = "";
                while (a.size() > 0 && a.get(a.size() - 1) != '[')
                {
                     
                    temp = a.get(a.size() - 1) + temp;
                    a.remove(a.size() - 1);
                }
                a.remove(a.size() - 1);
                String num = "";
                while (a.size() > 0 &&
                      a.get(a.size() - 1) >= 48 &&
                      a.get(a.size() - 1) <= 57)
                {
                    num = a.get(a.size() - 1) + num;
                    a.remove(a.size() - 1);
                }
                 
                int number = Integer.parseInt(num);
                String repeat = "";
                for(int j = 0; j < number; j++)
                    repeat += temp;
                     
                for(int c = 0; c < repeat.length(); c++)
                    a.add(repeat.charAt(c));
            }
            else
                a.add(s.charAt(i));
        }
        String res = "";
        while (a.size() > 0)
        {
            res = a.get(a.size() - 1) + res;
            a.remove(a.size() - 1);
        }
        return res;
    }
}