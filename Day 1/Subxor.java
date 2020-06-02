import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       int a[] = new int[n];
       for(int i=0 ;i<n;i++){
           a[i] = sc.nextInt();
       }
         
    int res = 0; 
   for(int i = 0;i<n;i++){
       res = res^a[i];
 
   }if(res != 0){
       System.out.println("1");
   }else{
       System.out.println("-1");
   }
    }
}
 
