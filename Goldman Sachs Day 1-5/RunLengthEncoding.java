import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}

// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          int i=1;
          int k=0;
          int c=1;
          String s="";
           
          while (i<str.length()) {
            if (str.charAt(i)==str.charAt(i-1))c++;
            else {
                s+=str.charAt(i-1);
                s+=c;
                c=1;
              }
            i++;  
          }
        s+=(str.charAt(i-1));
        s+=c;

          return s;
	}
	
 }