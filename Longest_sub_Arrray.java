import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 class Longest_sub_Arrray {
    public static void main(String args[] ) throws Exception {
        Scanner s= new Scanner (System.in);
          int n=s.nextInt(),k=s.nextInt();
          int [] arr= new int [n];
          for(int i=0;i<n;i++) arr[i]= s.nextInt();
          int max=0;
          for(int i=1;i<=n-k;i++){
              for(int j=0;j<k;j++){
                  if (arr[i+j]>arr[max+j]) max= i;
                  if (arr[i+j]!=arr[max+j]) break;
              }
          }
          for(int i=0;i<k;i++) System.out.print(arr[max+i]+" ");
          
    }
}