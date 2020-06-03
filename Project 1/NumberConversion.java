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
     private static String octaltohexa(String number) {

		// Convert Octal to Decimal
		int decimal = octaltodeci(number);
		// Convert Decimal to Hexadecimal
		String hexadecimal = Decitohexa(decimal);
		return hexadecimal;
	}

	private static String Decitohexa(int decimal) {

		int remainder = 0;
		StringBuilder hexadecimal = new StringBuilder();
		String result;
		while (decimal != 0) {
			remainder = decimal % 16;
			if (remainder >= 10 && remainder <= 15) {
				char hexChar = getHexadecimalCharacter(remainder);
			
				result = String.valueOf(hexChar);
			} else {
				
				result = String.valueOf(remainder);
			}
			
			hexadecimal.append(String.valueOf(result));
			decimal = decimal / 16;
		}

		
		return hexadecimal.reverse().toString();
	}

	private static int octaltodeci(String number) {

		
		StringBuilder string = new StringBuilder(number);
		string = string.reverse();
		int length = string.length();
		int digit, power, sum = 0;
		for (int i = 0; i < length; i++) {
			digit = string.charAt(i) - 48;
			power = (int) Math.pow(8, i);
			sum = sum + digit * power;
		}
		return sum;
	}

	

	private static char getHexadecimalCharacter(int remainder) {

		char ch = '\u0000';
		switch (remainder) {
		case 10:
			ch = 'A';
			break;
		case 11:
			ch = 'B';
			break;
		case 12:
			ch = 'C';
			break;
		case 13:
			ch = 'D';
			break;
		case 14:
			ch = 'E';
			break;
		case 15:
			ch = 'F';
			break;
		}
		return ch;
	}
        static void decToOctal(int n) 
    { 
        
        int[] octalNum = new int[100]; 
  
        int i = 0; 
        while (n != 0)  
        { 
            
            octalNum[i] = n % 8; 
            n = n / 8; 
            i++; 
        } 
  
      
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(octalNum[j]); 
    } 
        public static int BinarytoOctal(long binaryNumber)
    {
        int octalNumber = 0, decimalNumber = 0, i = 0;

        while(binaryNumber != 0)
        {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
            ++i;
            binaryNumber /= 10;
        }

        i = 1;

        while (decimalNumber != 0)
        {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }

        return octalNumber;
    }
public static long OctalToBinary(int octalNumber)
    {
        int decimalNumber = 0, i = 0;
        long binaryNumber = 0;

        while(octalNumber != 0)
        {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber/=10;
        }

        i = 1;

        while (decimalNumber != 0)
        {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }

        return binaryNumber;
    }
 public static String HexToBinary(String hex) {
                StringBuilder binStrBuilder = new StringBuilder();
                int c = 1;
                for (int i = 0; i < hex.length() - 1; i += 2) {

                        String output = hex.substring(i, (i + 2));

                        int decimal = Integer.parseInt(output, 16);

                        String binStr = Integer.toBinaryString(decimal);
                        int len = binStr.length();
                        StringBuilder sbf = new StringBuilder();
                        if (len < 8) {

                                for (int k = 0; k < (8 - len); k++) {
                                        sbf.append("0");
                                }
                                sbf.append(binStr);
                        } else {
                                sbf.append(binStr);
                        }

                        c++;
                        binStrBuilder.append(sbf.toString());
                }

                return binStrBuilder.toString();
        }

     
     

        public static void main(String[] args) {
    
    
    
    }
    
}
