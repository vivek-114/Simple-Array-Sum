import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 class Alaphabet_ordering {
    public static void main(String args[] ) throws Exception {
        Scanner s= new Scanner (System.in);
          String str= s.nextLine();
          int c=0,i=0, n= str.length();
          char [] ar=new char [n];
          for(int j=0;j<n;j++) ar[j]= str.charAt(j);
          while(i<n){
              c++;
              char ch =  ar[i];
              while(i<n&&ar[i]==ch) i++;
              if (i<n&&ar[i]>ar[i-1]) while(i<n&&ar[i]>ar[i-1])i++;
              else while(i<n&&ar[i]<ar[i-1])i++;
          }
          System.out.println(c);
    }
