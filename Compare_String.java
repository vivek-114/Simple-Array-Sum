import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 class Compare_String {
    public static void main(String args[] ) throws Exception {
        Scanner s= new Scanner (System.in);
        String [] str = s.nextLine().split(" ");
        String [] str2= s.nextLine().split(" ");
        int[] fri = new int [11];
        int [] arr= new int [str2.length];
        for(int j=0;j<str.length;j++){
            char [] ch= str[j].toCharArray();
            int min=125,c=0;
            for(int i=0;i<ch.length;i++) min= Math.min(min,(ch[i]-'a'));
            for(int i=0;i<ch.length;i++) if(min==(ch[i]-'a')) c++;
            fri[c]+=1;
        }
        for(int i=1;i<11;i++) fri[i]=fri[i-1]+fri[i];
         for(int j=0;j<str2.length;j++){
            char [] ch= str2[j].toCharArray();
            int min=125,c=0;
            for(int i=0;i<ch.length;i++) min= Math.min(min,(ch[i]-'a'));
            for(int i=0;i<ch.length;i++) if(min==(ch[i]-'a')) c++;
            arr[j]= fri[c-1]; 
        }
        System.out.println(Arrays.toString(arr));
          
    }
}