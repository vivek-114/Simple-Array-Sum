import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 class Maximum_sub_array {
    public static void main(String args[] ) throws Exception {
        Scanner s= new Scanner (System.in);
        int t = s.nextInt();
        while (t-->0){
            HashMap<Integer, Integer> hm= new  HashMap<Integer, Integer > ();
            int n=  s.nextInt();
            int k=  s.nextInt();
            int sum= 0, cur=0,min=n;
            int arr[] =  new int [n];
            for(int i=0;i<n;i++){
                int dat=  s.nextInt();
                if(dat>k) arr[i]=+1;
                else if(dat<k) arr[i]=-1;
                sum+=arr[i];
            }
            for(int i=0;i<n;i++){
               cur+=arr[i];
               if (hm.containsKey(cur-sum)){
                   min= Math.min(min, (i-hm.get(cur-sum)));
               }
               if (min== cur) break;
               hm.put(cur,i);
            }
            System.out.println(n-min);
        }
    }
}