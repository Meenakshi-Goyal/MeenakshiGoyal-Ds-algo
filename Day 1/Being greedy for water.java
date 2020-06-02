import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int bottle=sc.nextInt();
            int capcon=sc.nextInt();
            int arr[]=new int[bottle];
            for(int i=0;i<bottle;i++)
            {
                arr[i]=sc.nextInt();
            }
            count(arr,bottle,capcon);
            t--;
        }
       
    }
    public static void count(int arr[],int bottle,int capcon)
    {
        Arrays.sort(arr);
        int sum=0,c=0;
        for(int i=0;i<bottle;i++)
        {
            sum=sum+arr[i];
 
            if(sum>capcon)
            {
                break;
            }
            else
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
