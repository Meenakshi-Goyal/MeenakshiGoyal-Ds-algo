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
