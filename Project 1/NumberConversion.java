import java.util.*;
public class Conversion {

   
       static int binaryToDecimal(int n) 
    { 
        int num = n; 
        int dec_value = 0; 
        int base = 1; 
  
        int temp = num; 
        while (temp > 0) { 
            int last_digit = temp % 10; 
            temp = temp / 10; 
  
            dec_value += last_digit * base; 
  
            base = base * 2; 
        } 
  
        return dec_value; 
    } 
         static void decToBinary(int n) 
    { 
        
        int[] binaryNum = new int[1000]; 
   
        
        int i = 0; 
        while (n > 0)  
        { 
           
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   
       
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
         
    }
     static String dectoHex(int n){    
     int rem;  
     String hex="";   
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(n>0)  
     {  
       rem=n%16;   
       hex=hexchars[rem]+hex;   
       n=n/16;  
     }  
    return hex;  
}
     public static int hextodeci(String hex){  
    String digits = "0123456789ABCDEF";  
             hex = hex.toUpperCase();  
             int val = 0;  
             for (int i = 0; i < hex.length(); i++)  
             {  
                 char c = hex.charAt(i);  
                 int d = digits.indexOf(c);  
                 val = 16*val + d;  
             }  
             return val;  
} 
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String hex = sc.next();
    System.out.println(binaryToDecimal(n));
    decToBinary(n);
    System.out.println(dectoHex(n));
    System.out.println(hextodeci(hex));
    
    
    }
    
}

