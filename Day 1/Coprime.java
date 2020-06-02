import java.util.*;
public class Solution2 {
 
static int gcd(int a, int b)
{
// Everything divides 0
if (a == 0)
return b;
if (b == 0)
return a;
 
// base case
if (a == b)
return a;
 
// a is greater
if (a > b)
return gcd(a-b, b);
return gcd(a, b-a);
}
 
// Driver method
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int maxCoPrime=1;
for(int i=1;i<n-1;i++){
if(gcd(i,n)==1){
maxCoPrime=i;
}
}
System.out.println(maxCoPrime);
}
}
