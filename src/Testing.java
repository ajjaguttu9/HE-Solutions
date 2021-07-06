import java.io.*;
import java.util.*;

public class Testing {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            long K = Long.parseLong(br.readLine().trim());
            String S = br.readLine();

            String out_ = solve(K, S);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    public static char toogle(char c){
        if(c=='X')
            c='O';
        else
            c='X';
        return c;
    }
    static String solve(long K, String S){        
       
    	char[] mc = S.toCharArray();
       for(int k_i = (int) K; k_i > 0; k_i--){
	       if (mc[0]=='O')
	           	mc[0] = 'X';
	       else 
	        	mc[0] = 'O';
	       char temp = mc[0];
	       
           int i=0;
           
           while(temp == 'X' && i<(mc.length-1)) {
        	   mc[i+1] = toogle(mc[i+1]);
        	   temp = mc[i+1];
           		i=i+1;  
           }           
       }
       S  = String.valueOf(mc);
       return S;       
    
    }
}
