#codechef
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
	        Scanner sc= new Scanner(System.in);
    		int t = sc.nextInt();
    		while(t>0)
    		{
    		    int n = sc.nextInt();
    		    int[][] arr = new int[n][n];
    		    for(int i =0;i<n;i++)
    		    {
    		        for(int j=0;j<=i;j++)
    		        {
    		            arr[i][j] = sc.nextInt();
    		        }
    		    }
    		    for(int i=n-1;i>0;i--)
    		    {
    		        for(int j=0;j<i;j++)
    		        {
    		            if(arr[i][j]>arr[i][j+1])
    		            {
        		            arr[i-1][j] += arr[i][j];
        		        }
        		        else
        		        {
        		            arr[i-1][j] += arr[i][j+1];
        		        }
        		    }
        	    }
        	    System.out.println(arr[0][0]);
        	    t--;
    		}
	    }
	    catch(Exception e)
	    {
	        return ;
	    }
		
		
	}
}
