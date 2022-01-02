//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String sort (String s) {
        char a[]=s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String,Integer>hm=new HashMap<String,Integer>();
        ArrayList<List<String>>aa=new ArrayList<>();
        int index=0;
        for (String s:string_list ) {
            String key=sort(s);
            hm.put(key,hm.getOrDefault(key,index));
            if(hm.get(key)==index)index++;
            if (aa.size()<=hm.get(key)) {
                aa.add(new ArrayList<String>());
            }
            aa.get(hm.get(key)).add(s);
        }
        return aa;
    }
}
