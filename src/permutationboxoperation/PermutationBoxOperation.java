
package permutationboxoperation;

import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;




 

 

public class PermutationBoxOperation {
 


 

   
    public static void main(String[] args) {
        Scanner  s1=new Scanner(System.in);
      
       
  double sizebox=s1.nextDouble();
   int []permbox=new int[(int)sizebox];
  
    
             
             
    for(int i=0;i<sizebox;i++)
    {
        int y= Integer.parseInt(s1.next());
      
        
            permbox[i]=y;
    }
  double inputsize=s1.nextDouble();
 
        
  
   String plain=s1.next();
   String output=new String();
   String hexStr=new String();
   String formatedinput=new String();
   String x="";
   
   for(int p=0;p<plain.length();p++)
   {
      switch (plain.charAt(p))
      {
          case '0':
              x="0000";
              break;
              case'1':
                  x="0001";
                  break;
              case '2':
                  x="0010";
                  break;
              case '3':
                  x="0011";
                  break;
              case '4':
                  x="0100";
                  break;
              case '5':
                  x="0101";
                  break;
              case '6':
                  x="0110";
                  break;
              case '7':
                  x="0111";
                  break;
              case '8':
                  x="1000";
                  break;
              case '9':
                  x="1001";
                  break;
              case 'A':
                  x="1010";
                  break;
              case 'B':
                  x="1011";
                  break;
              case 'C':
                  x="1100";
                  break;
              case 'D':
                  x="1101";
                  break;
              case 'E':
                  x="1110";
                  break;
              case 'F':
                  x="1111";
                  break;
                  
              
      }
      formatedinput=formatedinput+x;
   }
  // String formatedinput=new BigInteger(plain, 16).toString(2);
   for(int k=0;k<permbox.length;k++)
   {
      output=output+formatedinput.charAt((permbox[k]-1)); 
   }
  for(int i=0; i<output.length();i=i+4)
  {
      String temp=output.substring(i, i+4);
  
    int decimal = Integer.parseInt(temp, 2);
hexStr = hexStr+ Integer.toHexString(decimal);
        
  }
        System.out.println(hexStr.toUpperCase());
 
}
    
}