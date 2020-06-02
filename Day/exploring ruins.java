import java.util.*;
class soution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		for(int i = 0;i<ch.length;i++){
			if(ch[i] == '?'){
			
			if (ch[i-1] != 'a' && ch[i+1] != 'a') {
			ch[i] = 'a';
			} else {
				ch[i] = 'b';
			}
			}
           System.out.println(ch[i]); 
		}
		
	}
} 
