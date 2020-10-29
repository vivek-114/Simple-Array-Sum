import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 class Maximum_time {
    public static void main(String args[] ) throws Exception {
        Scanner s= new Scanner (System.in);
          String str= s.nextLine();
          if(str.charAt(0)=='?'){
              if(str.charAt(1)=='1'||str.charAt(1)=='2'||str.charAt(1)=='3'||str.charAt(1)=='0')  str= "2"+str.substring(1);
               else  str= "1"+str.substring(1);}
          if(str.charAt(1)=='?'){
              if(str.charAt(0)=='2') str= str.charAt(0)+"3"+str.substring(2);
              else str= str.charAt(0)+"9"+str.substring(2);
          }
          if(str.charAt(3)=='?')  str= str.substring(0,3)+"5"+str.charAt(4);
          if(str.charAt(4)=='?')  str= str.substring(0,4)+"9";
          System.out.println(str);
    }
}