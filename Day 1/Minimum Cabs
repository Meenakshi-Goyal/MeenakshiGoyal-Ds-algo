import java.util.*;
class TestClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[24*60+1];
        while(t!=0)
        {
          int st=sc.nextInt()*60+sc.nextInt();
          int  et=sc.nextInt()*60+sc.nextInt();
           for(int i=st;i<=et;i++)
           {
               arr[i]++;
           }
           t--;
        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
